package top.ztboxs.user.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/09/23:23
 * @Description: 登录请求
 */
@Data
public class UserLoginDto implements Serializable {

    private static final long serialVersionUID = 4123241716373120793L;

    @NotBlank(message = "账号不能为空")
    @Size(min=4, max=12)
    @ApiModelProperty("账号")
    private String userAccount;

    @NotNull
    @Range(min = 6, max = 16, message = "密码长度必须在{min}和{max}之间")
    @ApiModelProperty("密码")
    private String userPassword;

}
