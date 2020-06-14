package org.liu.fund.common.exception;

/**
 * 自定义异常
 */
public class CustomException extends RuntimeException {

    public CustomException(String msg){
        super(msg);
    }

    public CustomException() {
        super();
    }
}
