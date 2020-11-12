package org.liu.fund.schedule;

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
			sysTaskService.finishTask(sysTaskModel);
		}
	}
	//@Scheduled(fixedRate = 10 * 60 * 1000)
	@Scheduled(cron = "0 30/45 9-13 0 0 1/5 ")
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
			sysTaskService.finishTask(sysTaskModel);
		}
	}
	@Scheduled(fixedRate = 60 * 60 * 1000)
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
			sysTaskService.finishTask(sysTaskModel);
		}
	}
}
