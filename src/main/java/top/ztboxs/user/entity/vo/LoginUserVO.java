package top.ztboxs.user.entity.vo;

import lombok.Data;

import java.util.Date;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/09/23:26
 * @Description: 已登录用户视图（脱敏）
 */
@Data
public class LoginUserVO {
    /**
     * 用户 id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 用户简介
     */
    private String userProfile;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
