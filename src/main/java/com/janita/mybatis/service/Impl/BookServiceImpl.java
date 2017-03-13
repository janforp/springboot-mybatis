package com.janita.mybatis.service.Impl;



import com.janita.mybatis.bean.TeachBook;
import com.janita.mybatis.dao.TeachBookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.janita.mybatis.service.IBookService;

/**
 * Created by Janita on 2017/3/13 0013
 */
@Service("bookService")
public class BookServiceImpl implements IBookService {

    @Autowired
    private TeachBookDAO teachBookDAO;

    //每一秒调用一次  -- 用于测试
    @Scheduled(cron = "0/1 * *  * * ?")
    public  void printName() {
        System.out.println("my name is yang ");
    }

    @Override
    public void createBook(TeachBook book) {
        teachBookDAO.insert(book);
    }
}