package com.janita.mybatis.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.janita.mybatis.bean.TeachBook;
import com.janita.mybatis.dao.TeachBookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.janita.mybatis.service.IBookService;

import java.util.List;

/**
 * Created by Janita on 2017/3/13 0013
 */
@Service("bookService")
public class BookServiceImpl implements IBookService {

    @Autowired
    private TeachBookDAO teachBookDAO;

    @Override
    public void createBook(TeachBook book) {
        teachBookDAO.insert(book);
        //TODD 注意：在类似dubbo的分布式项目中，若此接口时被远程调用的，则在远程的book中是没有此bookId的，只有此方法返回了该对象才能有id，因为
        //远程跟本地是两个不同的对象
        System.out.println("*******"+book.getBookId());
    }

    @Override
    public PageInfo<TeachBook> getBookList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TeachBook> teachBooks = teachBookDAO.bookList();
        PageInfo<TeachBook> pageInfo = new PageInfo<>(teachBooks);

        return pageInfo;
    }

    @Override
    public TeachBook upsert(TeachBook book) {
        teachBookDAO.upsertBook(book);
        return book;
    }
}