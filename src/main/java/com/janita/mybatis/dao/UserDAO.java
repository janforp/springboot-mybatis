package com.janita.mybatis.dao;

import com.janita.mybatis.bean.User;

import java.util.List;

/**
 * Created by com.janita.mybatis.MybatisCodeGenerate on 2017-03-13
 */
public interface UserDAO {
    int deleteByPrimaryKey(Long userId);

    void insert(User record);

    void insertSelective(User record);

    void insertBatch(List<User> records);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}