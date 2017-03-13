package com.janita.mybatis.bean;

/**
 * Created by com.janita.mybatis.MybatisCodeGenerate on 2017-03-13
 */
public class TeachBook implements java.io.Serializable {

    // Fields

    private Integer bookId;
    private String bookName;
    private String publisher;

    // Constructors

    /**
     * default constructor
     */
    public TeachBook() {
    }

    /**
     * full constructor
     */
    public TeachBook(String bookName, String publisher) {
        this.bookName = bookName;
        this.publisher = publisher;
    }

    // Property accessors

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}