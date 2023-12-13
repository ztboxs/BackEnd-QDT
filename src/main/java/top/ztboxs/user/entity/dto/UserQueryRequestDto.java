package top.ztboxs.user.entity.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.ztboxs.common.util.PageRequest;

import java.io.Serializable;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/12/23:50
 * @Description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserQueryRequestDto extends PageRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 开放平台id
     */
    private String unionId;

    /**
     * 公众号openId
     */
    private String mpOpenId;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    private static final long serialVersionUID = 1L;
}
