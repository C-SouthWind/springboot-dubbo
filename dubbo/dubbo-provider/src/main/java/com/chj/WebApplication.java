package com.chj;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：chj
 * @date ：Created in 2020/3/8 15:03
 * @params :  启动类
 */
@SpringBootApplication
@EnableDubbo
@MapperScan("com.chj.mapper")
public class WebApplication {
    public static void main(String[] args) {
         SpringApplication.run(WebApplication.class,args);
    }
}
