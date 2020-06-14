package org.liu.fund.common.entity;

import lombok.Data;


/**
 * @author liu
 */
@Data
public class Result<T> implements java.io.Serializable {

    private static final long serialVersionUID = 752386055477259305L;

    public static final String SUCCESS = "SUCCESS";
    public static final String ERROR = "FAIL";
    public static final Integer SUCCESS_CODE = 200;
    public static final Integer ERROR_CODE = 500;
    private Integer code;
    private String msg;
    private T data;
    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public Result(Integer code, String msg, String verifyCode,T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success(String msg,String verifyCode, T data) {
        return new Result<T>(SUCCESS_CODE, msg,verifyCode, data);
    }
    public static <T> Result<T> success(String msg, T data) {
        return new Result<T>(SUCCESS_CODE, msg, data);
    }

    public static <T> Result<T> success(String msg) {
        return new Result<T>(SUCCESS_CODE, msg);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(SUCCESS_CODE, SUCCESS, data);
    }

    public static <T> Result<T> success() {
        return new Result<T>(SUCCESS_CODE, SUCCESS);
    }

    public static <T> Result<T> error(String msg, T data) {
        return new Result<T>(ERROR_CODE, msg, data);
    }

    public static <T> Result<T> error(String msg) {
        return new Result<T>(ERROR_CODE, msg);
    }

    public static <T> Result<T> error(T data) {
        return new Result<T>(ERROR_CODE, data);
    }

    public static <T> Result<T> error() {
        return new Result<T>(ERROR_CODE, ERROR);
    }

}
