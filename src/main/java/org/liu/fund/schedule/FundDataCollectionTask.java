package org.liu.fund.schedule;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.liu.fund.dao.model.SysTaskModel;
import org.liu.fund.service.FundDataCollectionService;
import org.liu.fund.service.SysTaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author liu
 */
@Slf4j
@Component
public class FundDataCollectionTask {
	@Autowired
	private FundDataCollectionService fundDataCollectionService;
	@Autowired
	private SysTaskService sysTaskService;

	@Scheduled(fixedRate = 10 * 60 * 1000)
	//@Scheduled(cron = "0 0 0 * * ?")
	public void collectionCompanyData(){
		int retryCount = 0;
		SysTaskModel sysTaskModel = null;
		try {
			sysTaskModel = sysTaskService.initCollectionCompanyDataTask();
			fundDataCollectionService.fundCollectionCompanyData(sysTaskModel);
		}catch (Exception e){
			log.error(e.getMessage());
			retryCount++;
			fundDataCollectionService.retryCollectionCompanyData(sysTaskModel,retryCount);
		}finally {
			log.info("任务相关数据：{}", JSONObject.toJSONString(sysTaskModel));
			sysTaskService.finishTask(sysTaskModel);
		}
	}
	@Scheduled(fixedRate = 10 * 60 * 1000)
	//@Scheduled(cron = "0 30/45 09-15 ? * 2-6")
	public void collectionAllFundData(){
		int retryCount = 0;
		SysTaskModel sysTaskModel = null;
		try {
			sysTaskModel = sysTaskService.initCollectionAllFundDataTask();
			fundDataCollectionService.fundCollectionAllFundData(sysTaskModel);
		}catch (Exception e){
			log.error(e.getMessage());
			retryCount++;
			fundDataCollectionService.retryCollectionAllFundData(sysTaskModel,retryCount);
		}finally {
			log.info("任务相关数据：{}", JSONObject.toJSONString(sysTaskModel));
			sysTaskService.finishTask(sysTaskModel);
		}
	}
	//@Scheduled(fixedRate = 60 * 60 * 1000)
	@Scheduled(cron = "0 30/45 09-15 ? * 2-6")
	public void collectionFundRealTimeData(){
		int retryCount = 0;
		SysTaskModel sysTaskModel = null;
		try {
			sysTaskModel = sysTaskService.initCollectionFundRealTimeDataTask();
			fundDataCollectionService.fundCollectionFundRealTimeData(sysTaskModel);
		}catch (Exception e){
			log.error(e.getMessage());
			retryCount++;
			fundDataCollectionService.retryCollectionFundRealTimeData(sysTaskModel,retryCount);
		}finally {
			log.info("任务相关数据：{}", JSONObject.toJSONString(sysTaskModel));
			sysTaskService.finishTask(sysTaskModel);
		}
	}
	@Scheduled(fixedRate = 30 * 60 * 1000)
	//@Scheduled(cron = "0 0 8 * * ?")
	public void collectionFundSuspendPurchData(){
		int retryCount = 0;
		SysTaskModel sysTaskModel = null;
		try {
			sysTaskModel = sysTaskService.initCollectionFundSuspendPurchDataTask();
			fundDataCollectionService.fundCollectionFundSuspendPurchData(sysTaskModel);
		}catch (Exception e){
			log.error(e.getMessage());
			retryCount++;
			fundDataCollectionService.retryCollectionFundSuspendPurchData(sysTaskModel,retryCount);
		}finally {
			log.info("任务相关数据：{}", JSONObject.toJSONString(sysTaskModel));
			sysTaskService.finishTask(sysTaskModel);
		}
	}
	@Scheduled(fixedRate = 30 * 60 * 1000)
	//@Scheduled(cron = "0 0 8 * * ?")
	public void collectionFundSuspendRedeeData(){
		int retryCount = 0;
		SysTaskModel sysTaskModel = null;
		try {
			sysTaskModel = sysTaskService.initCollectionFundSuspendRedeeData();
			fundDataCollectionService.fundCollectionFundSuspendRedeeData(sysTaskModel);
		}catch (Exception e){
			log.error(e.getMessage());
			retryCount++;
			fundDataCollectionService.retryCollectionFundSuspendRedeeData(sysTaskModel,retryCount);
		}finally {
			log.info("任务相关数据：{}", JSONObject.toJSONString(sysTaskModel));
			sysTaskService.finishTask(sysTaskModel);
		}
	}
}
