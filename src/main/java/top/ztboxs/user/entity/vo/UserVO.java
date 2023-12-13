package top.ztboxs.user.entity.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/12/23:20
 * @Description: 用户视图（脱敏）
 */
@Data
public class UserVO implements Serializable {
    /**
     * id
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

    private static final long serialVersionUID = 1L;
}
