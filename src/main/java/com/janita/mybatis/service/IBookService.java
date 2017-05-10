package com.janita.mybatis.service;


import com.github.pagehelper.PageInfo;
import com.janita.mybatis.bean.TeachBook;

import java.util.List;

/**
 * The Interface IBookService.
 * Created by Janita on 2017/3/13 0013
 */
public interface IBookService {


    void createBook(TeachBook book);

    PageInfo<TeachBook> getBookList(Integer pageNum, Integer pageSize);

    TeachBook upsert(TeachBook book);

    String upsertBatch(List<TeachBook> books);
}