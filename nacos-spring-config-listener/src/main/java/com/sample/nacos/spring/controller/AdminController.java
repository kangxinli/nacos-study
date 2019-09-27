package com.sample.nacos.spring.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.nacos.spring.model.Admin;
import com.sample.nacos.spring.service.AdminService;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Admin get() {
        return adminService.getAdmin();
    }
}

