package org.liu.fund.common.enums;

import java.io.Serializable;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * 是否完成 枚举类
 */
public enum FinishEnum implements IEnum {
	INIT(0,"初始化"),
	PROGRESSING(1,"进行中"),
	FINISHED(2,"完成");
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
	FinishEnum(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	@Override
	public Serializable getValue() {
		return this.code;
	}
}
