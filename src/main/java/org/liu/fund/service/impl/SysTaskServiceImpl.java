package org.liu.fund.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.liu.fund.common.enums.FinishEnum;
import org.liu.fund.common.enums.TaskEnum;
import org.liu.fund.dao.mapper.SysTaskMapper;
import org.liu.fund.dao.model.SysTaskModel;
import org.liu.fund.service.SysTaskService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuhuan
 * @since 2020-06-14
 */
@Service
public class SysTaskServiceImpl extends ServiceImpl<SysTaskMapper, SysTaskModel> implements SysTaskService {

	@Override
	@Transactional(rollbackFor = Exception.class)
	public SysTaskModel initCollectionCompanyDataTask() {
		SysTaskModel sysTaskModel = new SysTaskModel();
		sysTaskModel.setTaskName(TaskEnum.COMPANYDATA.getDesc());
		sysTaskModel.setTaskCode(TaskEnum.COMPANYDATA.getCode());
		sysTaskModel.setIsFinish(FinishEnum.INIT.getCode());
		sysTaskModel.setRetryCount(0);
		sysTaskModel.setTaskStartTime(new Date());
		this.save(sysTaskModel);
		return sysTaskModel;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void finishTask(SysTaskModel sysTaskModel) {
		sysTaskModel.setIsFinish(FinishEnum.FINISHED.getCode());
		sysTaskModel.setTaskEndTime(new Date());
		this.updateById(sysTaskModel);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void progressing(SysTaskModel sysTaskModel) {
		sysTaskModel.setIsFinish(FinishEnum.PROGRESSING.getCode());
		this.updateById(sysTaskModel);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public SysTaskModel initCollectionAllFundDataTask() {
		SysTaskModel sysTaskModel = new SysTaskModel();
		sysTaskModel.setTaskName(TaskEnum.FUNDDATA.getDesc());
		sysTaskModel.setTaskCode(TaskEnum.FUNDDATA.getCode());
		sysTaskModel.setIsFinish(FinishEnum.INIT.getCode());
		sysTaskModel.setRetryCount(0);
		sysTaskModel.setTaskStartTime(new Date());
		this.save(sysTaskModel);
		return sysTaskModel;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public SysTaskModel initCollectionFundRealTimeDataTask() {
		SysTaskModel sysTaskModel = new SysTaskModel();
		sysTaskModel.setTaskName(TaskEnum.FUNDREALTIMEDATA.getDesc());
		sysTaskModel.setTaskCode(TaskEnum.FUNDREALTIMEDATA.getCode());
		sysTaskModel.setIsFinish(FinishEnum.INIT.getCode());
		sysTaskModel.setRetryCount(0);
		sysTaskModel.setTaskStartTime(new Date());
		this.save(sysTaskModel);
		return sysTaskModel;
	}
}
