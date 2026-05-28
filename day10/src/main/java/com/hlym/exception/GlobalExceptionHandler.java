package com.hlym.exception;

import com.hlym.pojo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)//捕获异常的种类
    public Result exception(Exception e) {
        e.printStackTrace();
        return Result.error("操作失败");
    }

}
