package dev.yong2ss.moduleapi.exceptionhandler;

import dev.yong2ss.moduleapi.exception.CustomException;
import dev.yong2ss.moduleapi.response.CommonResponse;
import dev.yong2ss.modulecommon.enums.CodeEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public CommonResponse handlerCustomException(CustomException e) {
        return CommonResponse.builder()
                            .code(e.getCode())
                            .message(e.getMessage())
                            .build();
    }

    @ExceptionHandler(Exception.class)
    public CommonResponse handlerException(Exception e) {
        return CommonResponse.builder()
                            .code(CodeEnum.UNKNOWN_ERROR.getCode())
                            .message(CodeEnum.UNKNOWN_ERROR.getMessage())
                            .build();
    }
}
