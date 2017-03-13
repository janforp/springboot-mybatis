package com.janita.mybatis.dao;

import com.janita.mybatis.bean.TeachBook;

import java.util.List;

/**
 * Created by com.us.example.MybatisCodeGenerate on 2017-03-12
 */
public interface TeachBookDAO {

    int deleteByPrimaryKey(Integer bookId);

    void insert(TeachBook record);

    void insertSelective(TeachBook record);

    void insertBatch(List<TeachBook> records);

    TeachBook selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(TeachBook record);

    int updateByPrimaryKey(TeachBook record);
}