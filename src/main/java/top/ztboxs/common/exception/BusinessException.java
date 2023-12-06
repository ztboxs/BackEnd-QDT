package top.ztboxs.common.exception;

import top.ztboxs.common.enums.ErrorCode;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/06/0:10
 * @Description: 自定义异常类
 */
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }

}
