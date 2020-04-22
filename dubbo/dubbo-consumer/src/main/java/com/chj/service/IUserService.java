package com.chj.service;

import com.chj.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/3/8 14:37
 * @params :
 */
public interface IUserService {
    /** 方法描述
    * @Description: 查询所有信息
    * @Param: []
    * @return: java.util.List<com.chj.model.User>
    * @Author: chj
    * @Date: 2020/3/8
    */
    List<User> selectAll();
}
