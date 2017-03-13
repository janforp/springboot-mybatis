package com.janita.mybatis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.springframework.boot.SpringApplication.*;

/**
 * Created by Janita on 2017/3/13 0013
 */
@ComponentScan(basePackages ="com.janita.mybatis")
@SpringBootApplication
@EnableScheduling
public class BootMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootMybatisApplication.class,args);
    }

}