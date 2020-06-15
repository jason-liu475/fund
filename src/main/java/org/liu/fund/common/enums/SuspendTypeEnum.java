package org.liu.fund.common.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

/**
 * 暂停类型 1:暂停申购 2:暂停赎回
 */
public enum SuspendTypeEnum implements IEnum {
	PURCH(1,"暂停申购"),
	REDEE(2,"暂停赎回");
	private final int code;
    private final String desc;
	public int getCode() {
		return code;
	}
	public String getDesc() {
		return desc;
	}
	/**
	 * @param code
	 * @param desc
	 */
	SuspendTypeEnum(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	@Override
	public Serializable getValue() {
		return this.code;
	}
}
