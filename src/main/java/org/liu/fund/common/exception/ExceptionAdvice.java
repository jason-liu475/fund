package org.liu.fund.common.exception;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;
import org.liu.fund.common.entity.Result;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * 异常控制处理器
 * @author liu
 */
@Slf4j
@RestControllerAdvice
public class ExceptionAdvice {


    /**
     * 捕获所有自定义异常
     * @return
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(CustomException.class)
    public Result handle(CustomException e) {
		log.error("catch the exception:{}",e);
        return new Result(HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

    /**
     * 捕获404异常
     * @return
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public Result handle(NoHandlerFoundException e) {
    	log.error("catch the exception:{}",e);
        return new Result(HttpStatus.NOT_FOUND.value(), e.getMessage());
    }

    /**
     * 捕获其他所有异常
     * @param request
     * @param ex
     * @return
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public Result globalException(HttpServletRequest request, Throwable ex) {
        ex.printStackTrace();
        log.error("捕获到异常：{}",ex);
        if (ex.getMessage().contains("Connection is not available, request timed out")){
            return new Result(this.getStatus(request).value(),"The network timeOut");
        }
        else {
            return new Result(this.getStatus(request).value(),ex.getMessage());
        }


    }

    /**
     * 获取状态码
     * @param request
     * @return
     */
    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
