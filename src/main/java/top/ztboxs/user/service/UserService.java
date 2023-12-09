package top.ztboxs.user.service;

import top.ztboxs.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import top.ztboxs.user.entity.dto.UserRegisterDto;
import top.ztboxs.user.entity.vo.LoginUserVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author ztboxs
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-12-05 23:56:58
*/
public interface UserService extends IService<User> {


    /**
     * 用户注册
     *
     * @param userRegisterDto
     * @return 新用户 id
     */
    long userRegister(UserRegisterDto userRegisterDto);

    /**
     * 用户登录
     * @param userAccount 账号
     * @param userPassword 密码
     * @param request
     * @return
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);
}
