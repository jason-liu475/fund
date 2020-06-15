package org.liu.fund.common.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * 任务 枚举类
 */
public enum TaskEnum implements IEnum {
	COMPANYDATA("TASK_01","获取基金公司数据"),
	FUNDDATA("TASK_02","获取所有基金数据"),
	FUNDHISDATA("TASK_03","获取单支基金历史数据"),
	FUNDREALTIMEDATA("TASK_04","获取单支基金实时数据"),
	FUNDSUSPENDPURCHDATA("TASK_05","获取全部暂停申购的基金数据"),
	FUNDSUSPENDREDEEDATA("TASK_06","获取全部暂停赎回的基金数据");
	private final String code;
    private final String desc;
	public String getCode() {
		return code;
	}
	public String getDesc() {
		return desc;
	}
	/**
	 * @param code
	 * @param desc
	 */
	TaskEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	@Override
	public Serializable getValue() {
		return this.code;
	}
}
