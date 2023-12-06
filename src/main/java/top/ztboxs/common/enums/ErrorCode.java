package top.ztboxs.common.enums;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/06/0:18
 * @Description: 自定义错误码枚举
 */
public enum ErrorCode {
    // 通用错误码
    SUCCESS(0, "成功"),
    FAILURE(-1, "操作失败"),
    SYSTEM_ERROR(1000, "系统错误"),
    PARAMETER_ERROR(1001, "参数错误"),
    UNAUTHORIZED(1003, "未授权"),
    PARAMS_ERROR(1004, "请求参数错误"),
    NOT_LOGIN_ERROR(1005, "未登录"),
    NO_AUTH_ERROR(1006, "无权限"),
    NOT_FOUND_ERROR(1007, "请求数据不存在"),
    FORBIDDEN_ERROR(1008, "禁止访问"),
    OPERATION_ERROR(1009, "操作失败"),

    //用户相关错误码

    // 业务错误码
    USER_NOT_FOUND(2001, "用户不存在"),
    INVALID_PASSWORD(2002, "密码错误"),

    // 文件上传相关错误码
    FILE_NOT_FOUND(2001, "文件未找到"),
    FILE_SIZE_EXCEEDED(2002, "文件大小超过限制"),
    FILE_TYPE_NOT_SUPPORTED(2003, "不支持的文件类型");


    /**
     * 状态码
     */
    private final int code;

    /**
     * 信息
     */
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
