package top.ztboxs.user.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/13/13:47
 * @Description:
 */
@Data
public class UserUpdateMyRequestDto implements Serializable {

    /**
     * 用户昵称
     */
    @ApiModelProperty("用户昵称")
    private String userName;

    /**
     * 用户头像
     */
    @ApiModelProperty("用户头像")
    private String userAvatar;

    /**
     * 简介
     */
    @ApiModelProperty("简介")
    private String userProfile;

    private static final long serialVersionUID = 1L;
}