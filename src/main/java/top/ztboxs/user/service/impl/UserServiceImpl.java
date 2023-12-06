package top.ztboxs.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.util.DigestUtils;
import top.ztboxs.common.enums.ErrorCode;
import top.ztboxs.common.exception.BusinessException;
import top.ztboxs.user.entity.User;
import top.ztboxs.user.entity.dto.UserRegisterDto;
import top.ztboxs.user.mapper.UserMapper;
import top.ztboxs.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author zt
 * @description 针对表【user(用户)】的数据库操作Service实现
 * @createDate 2023-12-05 23:56:58
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    /**
     * 盐值,混淆密码
     */
    public static final  String SALT = "ztboxs";
    @Override
    public long userRegister(UserRegisterDto userRegisterDto) {
        if (userRegisterDto == null) {
            throw new BusinessException(ErrorCode.PARAMETER_ERROR, "参数为空");
        }
        String userAccount = userRegisterDto.getUserAccount();
        String userPassword = userRegisterDto.getUserPassword();
        String checkPassword = userRegisterDto.getCheckPassword();
        // 密码和校验密码相同
        if (!Objects.equals(userPassword, checkPassword)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "两次输入的密码不一致");
        }
        synchronized (userAccount.intern()) {
            //详细写法账号不能重复
            //  QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            //  queryWrapper.eq("user_account",userAccount);
            //  Long aLong = baseMapper.selectCount(queryWrapper);
            //  if (aLong > 0) {
            //      throw new BusinessException(ErrorCode.PARAMS_ERROR,"账号重复");
            //  }
            // TODO: 2023/12/6  可以使用Java 8的流式编程来简化这段代码。以下是简化后的代码：
            if (baseMapper.selectCount(new QueryWrapper<User>().eq("user_account", userAccount)) > 0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR, "账号重复");
            }
            //对密码进行加密
            String encryptPassword = DigestUtils.md5DigestAsHex((SALT + userPassword).getBytes());
            //插入数据到数据库
            User user = new User();
            user.setUserAccount(userAccount);
            user.setUserPassword(userPassword);
            boolean save = this.save(user);
            if (!save) {
                throw new BusinessException(ErrorCode.SYSTEM_ERROR,"注册失败！数据库插入错误");
            }
            return user.getId();
        }
    }
}




