package com.chj;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：chj
 * @date ：Created in 2020/3/8 15:43
 * @params :
 */
@SpringBootApplication
@EnableDubbo
public class WebApplication {
    public static void main(String[] args) {
            SpringApplication.run(WebApplication.class,args);
    }
}
