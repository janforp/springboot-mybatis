package com.us.example.service.Impl;



import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.us.example.service.UserService;

/**
 *
 * @ClassName UserServiceImpl
 * @author abel
 * @date 2016年11月10日
 */
@Service
public class UserServiceImpl implements UserService {


    //每一秒调用一次  -- 用于测试
    @Scheduled(cron = "0/1 * *  * * ?")
    public  void printName() {
        System.out.println("my name is yang ");
    }

}