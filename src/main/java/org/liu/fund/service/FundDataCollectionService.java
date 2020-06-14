package org.liu.fund.service;

import org.liu.fund.dao.model.SysTaskModel;

public interface FundDataCollectionService {
	void fundCollectionCompanyData(SysTaskModel sysTaskModel) throws Exception;
	void retryCollectionCompanyData(SysTaskModel sysTaskModel,int retryCount);

	void fundCollectionAllFundData(SysTaskModel sysTaskModel);

	void retryCollectionAllFundData(SysTaskModel sysTaskModel, int retryCount);

	void fundCollectionFundRealTimeData(SysTaskModel sysTaskModel);

	void retryCollectionFundRealTimeData(SysTaskModel sysTaskModel, int retryCount);
}
