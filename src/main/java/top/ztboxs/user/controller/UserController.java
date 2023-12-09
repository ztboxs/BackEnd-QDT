package top.ztboxs.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import top.ztboxs.common.enums.ErrorCode;
import top.ztboxs.common.exception.BaseResponse;
import top.ztboxs.common.exception.BusinessException;
import top.ztboxs.common.exception.ResultsUtils;
import top.ztboxs.user.entity.dto.UserLoginDto;
import top.ztboxs.user.entity.dto.UserRegisterDto;
import top.ztboxs.user.entity.vo.LoginUserVO;
import top.ztboxs.user.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 天天进步
 *
 * @Author: ztbox
 * @Date: 2023/12/06/9:50
 * @Description:
 */
@Slf4j
@Api(tags = "用户相关接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("用户注册")
    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterDto userRegisterDto) {
        long register = userService.userRegister(userRegisterDto);
        return ResultsUtils.success(register);
    }

    /**
     * 用户登录
     *
     * @param userLoginDto
     * @param request
     * @return
     */
    @ApiOperation("用户注册")
    @PostMapping("/login")
    public BaseResponse<LoginUserVO> userLogin(@RequestBody UserLoginDto userLoginDto, HttpServletRequest request) {
        if (userLoginDto == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String userAccount = userLoginDto.getUserAccount();
        String userPassword = userLoginDto.getUserPassword();
        if (StringUtils.isAnyBlank(userAccount, userPassword)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        LoginUserVO loginUserVO = userService.userLogin(userAccount, userPassword, request);
        return ResultsUtils.success(loginUserVO);
    }



}
