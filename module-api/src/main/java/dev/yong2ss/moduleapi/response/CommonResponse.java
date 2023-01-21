package dev.yong2ss.moduleapi.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.yong2ss.modulecommon.enums.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CommonResponse<T> {
    private String code;
    private String message;
    private T info;

    public CommonResponse(CodeEnum codeEnum) {
        setCode(codeEnum.getCode());
        setMessage(codeEnum.getMessage());
    }

    public CommonResponse(T info) {
        setCode(CodeEnum.SUCCESS.getCode());
        setCode(CodeEnum.SUCCESS.getMessage());
        setInfo(info);
    }

    public CommonResponse(CodeEnum codeEnum, T info) {
        setCode(codeEnum.getCode());
        setMessage(codeEnum.getMessage());
        setInfo(info);
    }


}
