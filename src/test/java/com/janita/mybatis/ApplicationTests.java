package com.janita.mybatis;

import com.janita.mybatis.bean.TeachBook;
import com.janita.mybatis.bean.User;
import com.janita.mybatis.dao.UserDAO;
import com.janita.mybatis.service.IBookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Janita on 2017/3/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private IBookService bookService;

    @Autowired
    private UserDAO userDAO;

    @Test
    public void testInsertBook(){
        TeachBook book = new TeachBook();
        book.setBookId(1);
        book.setBookName("高一化学(上)");
        book.setPublisher("清华大学出版社");

        bookService.createBook(book);
    }

    @Test
    public void testUserDao(){
        User user = new User();
        user.setUserName("Jay");
        user.setAge(38);
        userDAO.insert(user);

        System.out.println("*****"+user.getUserId());
    }
}
