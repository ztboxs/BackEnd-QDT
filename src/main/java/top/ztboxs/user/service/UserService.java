package top.ztboxs.user.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import top.ztboxs.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import top.ztboxs.user.entity.dto.UserQueryRequestDto;
import top.ztboxs.user.entity.dto.UserRegisterDto;
import top.ztboxs.user.entity.vo.LoginUserVO;
import top.ztboxs.user.entity.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取脱敏的已登录用户信息
     *
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取脱敏的用户信息
     *
     * @param user
     * @return
     */
    UserVO getUserVO(User user);

    /**
     * 分页兼搜索
     * @param userQueryRequest
     * @return
     */
    IPage<UserVO> findByPage(UserQueryRequestDto userQueryRequest);

    /**
     * 获取脱敏的用户信息
     *
     * @param userList
     * @return
     */
    List<UserVO> getUserVO(List<User> userList);

    /**
     * 获取查询条件
     *
     * @param userQueryRequest
     * @return
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequestDto userQueryRequest);
}
