/*
 *Project: springboot-dubbo
 *File: com.example.provider.SpringbootDubboProviderApplication.java <2019年05月05日}>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/

package com.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author lizhou
 * @version 1.0
 * @Date 2019年05月05日 15时35分
 */

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
@EnableTransactionManagement//开启事物管理
@EnableAspectJAutoProxy //开启aop自动代理
public class SpringbootDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboProviderApplication.class, args);
    }
}



