package com.chj.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.chj.mapper.UserMapper;
import com.chj.model.User;
import com.chj.service.IUserService;
import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/3/8 14:43
 * @params :
 */
@Service(timeout = 50000)
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    /** 方法描述
    * @Description: 查询所有
    * @Param: []
    * @return: java.util.List<com.chj.model.User>
    * @Author: chj
    * @Date: 2020/3/8
    */
    @Override
    public List<User> selectAll() {
        List<User> userList = null;
        try {
            userList = userMapper.selectAll();
        }catch (MyBatisSystemException e){
            e.printStackTrace();
            userList = userMapper.selectAll();
        }finally {
            if (userList!=null && userList.size()>0) {
                return userList;
            }
            return null;
        }
    }
}
