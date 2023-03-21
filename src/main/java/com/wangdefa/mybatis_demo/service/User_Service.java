package com.wangdefa.mybatis_demo.service;

import com.wangdefa.mybatis_demo.entity.User;
import com.wangdefa.mybatis_demo.mapper.User_Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class User_Service implements User_Service_Interface {

    @Resource
    private User_Mapper mapper;

    @Override
    public String add(User user) {
        try {
            mapper.add(new User("abc","123","null"));
        } catch (DataAccessException e) {
            e.printStackTrace();
        }


        return null;
    }
}
