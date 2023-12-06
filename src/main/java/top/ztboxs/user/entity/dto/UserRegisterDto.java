package top.ztboxs.user.entity.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/06/11:29
 * @Description: 用户注册Dto
 */
@Data
public class UserRegisterDto {

    /**
     * 账号
     */
    @NotBlank(message = "账号不能为空")
    @Size(min=4, max=12)
    @ApiModelProperty("账号")
    private String userAccount;

    /**
     * 密码
     */
    @NotNull
    @Range(min = 6, max = 16, message = "密码长度必须在{min}和{max}之间")
    @ApiModelProperty("密码")
    private String userPassword;

    /**
     * 再次密码
     */
    @NotNull
    @Range(min = 6, max = 16, message = "密码长度必须在{min}和{max}之间")
    @ApiModelProperty("再次密码")
    private String checkPassword;

}
