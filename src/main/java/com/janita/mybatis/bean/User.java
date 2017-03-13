package com.janita.mybatis.bean;

/**
 * Created by com.janita.mybatis.MybatisCodeGenerate on 2017-03-13
 */
public class User implements java.io.Serializable {

    // Fields

    private Long userId;
    private Integer age;
    private String userName;

    // Constructors

    /**
     * default constructor
     */
    public User() {
    }

    /**
     * full constructor
     */
    public User(Integer age, String userName) {
        this.age = age;
        this.userName = userName;
    }

    // Property accessors

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}