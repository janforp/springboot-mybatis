package com.us.example.dao;

import com.us.example.bean.Member;

import java.util.List;
import java.util.Map;

/**
 * Created by Janita on 2017/3/12
 * 会员
 */
public interface MemberDao {

    List<Member> getList(Map<String,Object> map);

    Member selectByPrimaryKey(Member member);

    void insert(Member member);
}
