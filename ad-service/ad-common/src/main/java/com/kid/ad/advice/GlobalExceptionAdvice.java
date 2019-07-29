package com.kid.ad.advice;

import com.kid.ad.exception.AdException;
import com.kid.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author yuyh
 * @desription
 * @date 2019/7/29
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(AdException.class)
    public CommonResponse adExceptionHandler(AdException e) {
        CommonResponse response = new CommonResponse(-1,"business error");
        response.setData(e.getMessage());
        return response;
    }
}
