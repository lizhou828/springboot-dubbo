/*
 *Project: springboot-dubbo
 *File: com.example.consumer.controller.IndexController.java <2019年05月05日}>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/

package com.example.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboApi.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhou
 * @version 1.0
 * @Date 2019年05月05日 16时50分
 */
@RestController
public class IndexController {
    @Reference
    SayHello sayHello;

    @RequestMapping("/test")
    public String say(@RequestParam("name") String name) {
        return sayHello.sayHello(name);
    }

}
