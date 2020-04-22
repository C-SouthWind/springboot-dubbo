package com.chj.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chj.model.User;
import com.chj.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/3/8 15:32
 * @params :
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(loadbalance = "roundrobin")
    private IUserService userService;
    /** 方法描述 
    * @Description: 查询所有用户
    * @Param: []
    * @return: java.util.List<com.chj.model.User>
    * @Author: chj
    * @Date: 2020/3/8
    */
    @RequestMapping("selectALl")
    public List<User> selectAll(){
        List<User> userList = null;
        userList = userService.selectAll();
        if (null != userList) {
            return userList;
        }
        return null;
    }
}
