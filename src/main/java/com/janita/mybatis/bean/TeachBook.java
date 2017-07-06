package com.janita.mybatis.bean;

/**
 * Created by com.janita.mybatis.MybatisCodeGenerate on 2017-05-10
 */
public class TeachBook implements java.io.Serializable {

    // Fields

    private Integer bookId;
    private String bookName;
    private String bookNo;
    private String bookCountry;
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
    public TeachBook(String bookName, String bookNo, String bookCountry, String publisher) {
        this.bookName = bookName;
        this.bookNo = bookNo;
        this.bookCountry = bookCountry;
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

    public String getBookNo() {
        return this.bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookCountry() {
        return this.bookCountry;
    }

    public void setBookCountry(String bookCountry) {
        this.bookCountry = bookCountry;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}