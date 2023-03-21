package com.wangdefa.mybatis_demo.mapper;

import com.wangdefa.mybatis_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface User_Mapper {
    int add(User user);


}
