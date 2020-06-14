package org.liu.fund.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.liu.fund.dao.model.FundCompanyModel;
import org.liu.fund.dao.model.FundInfoModel;
import org.liu.fund.dao.model.FundRealTimeDataModel;
import org.liu.fund.dao.model.SysTaskModel;
import org.liu.fund.service.FundCompanyService;
import org.liu.fund.service.FundDataCollectionService;
import org.liu.fund.service.FundInfoService;
import org.liu.fund.service.FundRealTimeDataService;
import org.liu.fund.service.SysTaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;



/**
 * @author liu
 */
@Slf4j
@Service
public class FundDataCollectionServiceImpl implements FundDataCollectionService {
	@Autowired
	private SysTaskService sysTaskService;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private FundCompanyService fundCompanyService;
	@Autowired
	private FundInfoService fundInfoService;
	@Autowired
	private FundRealTimeDataService fundRealTimeDataService;
	@Value("${system.http.fund.host}")
	private String host;
	@Value("${system.http.fund.fundCompany}")
	private String fundCompanyUri;
	@Value("${system.http.fund.allFund}")
	private String allFundUri;
	@Value("${system.http.fund.fundRealTime}")
	private String fundRealTime;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void fundCollectionCompanyData(SysTaskModel sysTaskModel) throws Exception {
		sysTaskService.progressing(sysTaskModel);
		fundCollectionCompanyData();
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void retryCollectionCompanyData(SysTaskModel sysTaskModel, int retryCount) {
		sysTaskModel.setRetryCount(retryCount);
		sysTaskService.updateById(sysTaskModel);
		fundCollectionCompanyData();
	}

	@Override
	public void fundCollectionAllFundData(SysTaskModel sysTaskModel) {
		sysTaskService.progressing(sysTaskModel);
		fundCollectionAllFundData();
	}

	@Override
	public void retryCollectionAllFundData(SysTaskModel sysTaskModel, int retryCount) {
		sysTaskModel.setRetryCount(retryCount);
		sysTaskService.updateById(sysTaskModel);
		fundCollectionAllFundData();
	}

	@Override
	public void fundCollectionFundRealTimeData(SysTaskModel sysTaskModel) {
		sysTaskService.progressing(sysTaskModel);
		fundCollectionFundRealTimeData();
	}

	@Override
	public void retryCollectionFundRealTimeData(SysTaskModel sysTaskModel, int retryCount) {
		sysTaskModel.setRetryCount(retryCount);
		sysTaskService.updateById(sysTaskModel);
		fundCollectionFundRealTimeData();
	}

	private void fundCollectionCompanyData(){
		//1.获取基金公司数据
		String jsonString = getFundCompanyData();
		//2.解析数据
		List<FundCompanyModel> fundCompanyModelList = analysisFundCompanyData(jsonString);
		//3.筛选不存在 入库
		dbSubmitFundCompanyData(fundCompanyModelList);
	}
	private String getFundCompanyData(){
		String url = host + fundCompanyUri + "?dt=" + System.currentTimeMillis();
		log.info("url:{}", url);
		String jsonString = restTemplate.getForObject(url, String.class);
		log.info("result:{}", jsonString);
		return jsonString;
	}
	private List<FundCompanyModel> analysisFundCompanyData(String jsonString) {
		jsonString = jsonString.substring(jsonString.indexOf("{"));
		JSONObject jsonObject = JSONObject.parseObject(jsonString);
		JSONArray jsonArray = jsonObject.getJSONArray("op");
		if(CollectionUtils.isNotEmpty(jsonArray)) {
			List<FundCompanyModel> fundCompanyModelList = new ArrayList<>(jsonArray.size());
			FundCompanyModel fundCompanyModel = null;
			for (Object json : jsonArray) {
				JSONArray array = (JSONArray) json;
				fundCompanyModel = new FundCompanyModel();
				fundCompanyModel.setCompanyName(array.get(1).toString());
				fundCompanyModel.setCompanyCode(array.get(0).toString());
				fundCompanyModelList.add(fundCompanyModel);
			}
			return fundCompanyModelList;
		}else{
			return Collections.emptyList();
		}
	}
	private void dbSubmitFundCompanyData(List<FundCompanyModel> fundCompanyModelList) {
		if(CollectionUtils.isNotEmpty(fundCompanyModelList)) {
			List<FundCompanyModel> exists = fundCompanyService.list();
			List<String> existCompanyCodes = exists.stream().map(FundCompanyModel::getCompanyCode).collect(Collectors.toList());
			List<FundCompanyModel> notExists = fundCompanyModelList.stream().filter(t -> !existCompanyCodes.contains(t.getCompanyCode())).collect(Collectors.toList());
			fundCompanyService.saveBatch(notExists);
		}
	}
	private void fundCollectionAllFundData(){
		//1.获取所有基金数据
		String jsonString = getAllFundData();
		//2.解析数据
		List<FundInfoModel> fundInfoModelList = analysisAllFundData(jsonString);
		//3.筛选不存在 入库
		dbSubmitAllFundData(fundInfoModelList);
	}

	private String getAllFundData() {
		String url = host + allFundUri + "?v=" + System.currentTimeMillis();
		log.info("url:{}", url);
		String jsonString = restTemplate.getForObject(url, String.class);
		log.info("result:{}", jsonString);
		return jsonString;
	}

	private List<FundInfoModel> analysisAllFundData(String jsonString) {
		jsonString = jsonString.substring(jsonString.indexOf("["),jsonString.length() - 1);
		JSONArray jsonArray = JSONArray.parseArray(jsonString);
		if(CollectionUtils.isNotEmpty(jsonArray)) {
			List<FundInfoModel> fundInfoModelList = new ArrayList<>(jsonArray.size());
			FundInfoModel fundInfoModel = null;
			for (Object json : jsonArray) {
				JSONArray array = (JSONArray) json;
				fundInfoModel = new FundInfoModel();
				fundInfoModel.setFundCode(array.get(0).toString());
				fundInfoModel.setFundNameAbbreviation(array.get(1).toString());
				fundInfoModel.setFundName(array.get(2).toString());
				fundInfoModel.setInvestmentTargetType(array.get(3).toString());
				fundInfoModel.setFundNamePinyin(array.get(4).toString());
				fundInfoModelList.add(fundInfoModel);
			}
			return fundInfoModelList;
		}else{
			return Collections.emptyList();
		}
	}

	private void dbSubmitAllFundData(List<FundInfoModel> fundInfoModelList) {
		if(CollectionUtils.isNotEmpty(fundInfoModelList)) {
			List<FundInfoModel> exists = fundInfoService.list();
			List<String> existFundCodes = exists.stream().map(FundInfoModel::getFundCode).collect(Collectors.toList());
			List<FundInfoModel> notExists = fundInfoModelList.stream().filter(t -> !existFundCodes.contains(t.getFundCode())).collect(Collectors.toList());
			fundInfoService.saveBatch(notExists);
		}
	}
	private void fundCollectionFundRealTimeData(){
		//1.获取所有基金数据
		List<FundInfoModel> fundInfoModelList = fundInfoService.list();
		//2.获取单个基金实时数据
		List<FundRealTimeDataModel> fundRealTimeDataModelList = new ArrayList<>(fundInfoModelList.size());
		for(FundInfoModel fundInfoModel : fundInfoModelList){
			String jsonString = null;
			try {
				jsonString = getFundRealTimeData(fundInfoModel);
			}catch (Exception e){
				log.error(e.getMessage());
			}
			if(StringUtils.isNotBlank(jsonString)) {
				//3.解析数据
				FundRealTimeDataModel fundRealTimeDataModel = analysisFundRealTimeData(jsonString);
				if(Objects.nonNull(fundRealTimeDataModel)) {
					fundRealTimeDataModelList.add(fundRealTimeDataModel);
				}
			}
		}
		//4.入库
		dbSubmitFundRealTimeData(fundRealTimeDataModelList);

	}

	private String getFundRealTimeData(FundInfoModel fundInfoModel) throws RestClientException, HttpClientErrorException,Exception {
		String url = fundRealTime + fundInfoModel.getFundCode() + ".js?rt=" + System.currentTimeMillis();
		log.info("url:{}", url);
		String jsonString = restTemplate.getForObject(url, String.class);
		log.info("result:{}", jsonString);
		return jsonString;
	}

	private FundRealTimeDataModel analysisFundRealTimeData(String jsonString) {
		try {
			jsonString = jsonString.substring(jsonString.indexOf("{"),jsonString.lastIndexOf("}") + 1);
		}catch (Exception e){
			log.error("jsonString:{}",jsonString);
			log.error(e.getMessage());
			return null;
		}
		JSONObject jsonObject = JSONObject.parseObject(jsonString);
		FundRealTimeDataModel fundRealTimeDataModel = new FundRealTimeDataModel();
		fundRealTimeDataModel.setFundCode(jsonObject.getString("fundcode"));
		fundRealTimeDataModel.setFundName(jsonObject.getString("name"));
		fundRealTimeDataModel.setJzrq(jsonObject.getDate("jzrq"));
		fundRealTimeDataModel.setDwjz(jsonObject.getString("dwjz"));
		fundRealTimeDataModel.setGsz(jsonObject.getString("gsz"));
		fundRealTimeDataModel.setGszzl(jsonObject.getString("gszzl"));
		fundRealTimeDataModel.setGztime(jsonObject.getDate("gztime"));
		fundRealTimeDataModel.setUpdateTime(new Date());
		return fundRealTimeDataModel;
	}

	private void dbSubmitFundRealTimeData(List<FundRealTimeDataModel> fundRealTimeDataModelList) {
		fundRealTimeDataService.saveBatch(fundRealTimeDataModelList);
	}
}
