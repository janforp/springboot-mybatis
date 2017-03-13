package com.us.example;

import com.us.example.bean.Member;
import com.us.example.bean.TeachBook;
import com.us.example.dao.MemberDao;
import com.us.example.dao.TeachBookDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Janita on 2017/3/12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private MemberDao memberDao;
    @Autowired
    private TeachBookDAO teachBookDAO;

    @Test
    public void getMemberList(){
        Map<String,Object> map = new HashMap<>();

        map.put("id",1);
        List<Member> list = memberDao.getList(map);
        System.out.println("******"+list.size());
    }

    @Test
    public void testKey(){
        Member member = new Member();
        member.setId("1");

        Member member1 = memberDao.selectByPrimaryKey(member);

        System.out.println("******"+member1.getPassword());
    }

    @Test
    public void testInsert(){
        Member member = new Member();
        member.setId("4");
        member.setPassword("zcccpasss");
        member.setMemberName("朱晨剑");
        member.setEmail("janforp@163.com");
        member.setTelephone("138776445454");

        memberDao.insert(member);
    }

    @Test
    public void testBook(){

        TeachBook book = new TeachBook();
        book.setBookName("book");
        book.setPublisher("publisher");
        teachBookDAO.insert(book);
        System.out.println("******"+book.getBookId());
    }

    @Test
    public void testBook2(){

        TeachBook book = new TeachBook();
        book.setBookName("huaxie");
        book.setPublisher("出版社");
        teachBookDAO.insert(book);
        System.out.println("******"+book.getBookId());
    }
}
