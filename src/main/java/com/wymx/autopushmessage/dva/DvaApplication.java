package com.wymx.autopushmessage.dva;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan("com.*") //扫描component
@EnableScheduling //开启定时任务
public class DvaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DvaApplication.class, args);
    }

}
