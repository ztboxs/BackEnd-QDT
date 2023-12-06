package top.ztboxs.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.ztboxs.common.exception.BaseResponse;
import top.ztboxs.common.exception.ResultsUtils;
import top.ztboxs.user.entity.dto.UserRegisterDto;
import top.ztboxs.user.service.UserService;

import javax.annotation.Resource;

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



}
