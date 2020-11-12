package org.liu.fund.service;

import org.liu.fund.dao.model.SysTaskModel;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuhuan
 * @since 2020-06-14
 */
public interface SysTaskService extends IService<SysTaskModel> {

	SysTaskModel initCollectionCompanyDataTask();

	void finishTask(SysTaskModel sysTaskModel);

	void progressing(SysTaskModel sysTaskModel);

	SysTaskModel initCollectionAllFundDataTask();

	SysTaskModel initCollectionFundRealTimeDataTask();

    SysTaskModel initCollectionFundSuspendPurchDataTask();

	SysTaskModel initCollectionFundSuspendRedeeData();
}
