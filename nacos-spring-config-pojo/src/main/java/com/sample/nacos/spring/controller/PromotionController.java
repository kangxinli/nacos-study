package com.sample.nacos.spring.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.nacos.spring.model.Promotion;

@Controller
@RequestMapping("promotion")
public class PromotionController {

    @Autowired
    private Promotion promotion;

    @RequestMapping(method = GET)
    @ResponseBody
    public Promotion get() {
        return promotion;
    }

}

