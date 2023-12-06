package top.ztboxs.common.exception;

import lombok.Data;
import top.ztboxs.common.enums.ErrorCode;

import java.io.Serializable;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/06/0:36
 * @Description: 通用返回类
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
