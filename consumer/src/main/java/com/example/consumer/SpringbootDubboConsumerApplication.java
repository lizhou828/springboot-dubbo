/*
 *Project: springboot-dubbo
 *File: com.example.consumer.SpringbootDubboConsumerApplication.java <2019年05月05日}>
 ****************************************************************
 * 版权所有@2015 国裕网络科技  保留所有权利.
 ***************************************************************/

package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @author lizhou
 * @version 1.0
 * @Date 2019年05月05日 15时55分
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@ImportResource("classpath:dubbo-consumer.xml")
public class SpringbootDubboConsumerApplication {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(SpringbootDubboConsumerApplication.class, args);
    }

}
