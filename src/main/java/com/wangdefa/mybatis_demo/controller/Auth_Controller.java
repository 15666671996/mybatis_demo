package com.wangdefa.mybatis_demo.controller;

import com.wangdefa.mybatis_demo.service.User_Service_Interface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Auth_Controller {

    @Resource
    private User_Service_Interface service;

    @RequestMapping("/test")
    public String Test() {
        service.add(null);


        return "hahaha";
    }


}
