/*
 *Project: springboot-dubbo
 *File: com.example.provider.service.SayHelloImpl.java <2019年05月05日}>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/

package com.example.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboApi.SayHello;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lizhou
 * @version 1.0
 * @Date 2019年05月05日 15时43分
 */

@Transactional(rollbackFor = Exception.class)
@Service
public class SayHelloImpl implements SayHello {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
