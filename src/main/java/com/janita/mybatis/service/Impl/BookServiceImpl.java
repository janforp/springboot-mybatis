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
    }

    @Override
    public PageInfo<TeachBook> getBookList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TeachBook> teachBooks = teachBookDAO.bookList();
        PageInfo<TeachBook> pageInfo = new PageInfo<>(teachBooks);

        return pageInfo;
    }
}