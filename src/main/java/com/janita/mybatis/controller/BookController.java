package com.janita.mybatis.controller;


import com.janita.mybatis.bean.TeachBook;
import com.janita.mybatis.constant.Consts;
import com.janita.mybatis.constant.ResultDto;
import com.janita.mybatis.service.IBookService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @ClassName BookController
 * @author janita
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @RequestMapping(value = "/addBook",method = RequestMethod.POST)
    public ResultDto createBook(@RequestBody TeachBook book){
        bookService.createBook(book);
        return ResultDto.toSuccess("添加课本成功");
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ResultDto test(){
        return ResultDto.toSuccess("成功");
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation(value = "分页查询")
    public ResultDto findBookList(Integer pageNum){
        return ResultDto.toSuccess(bookService.getBookList(pageNum, Consts.pageSize));
    }

    @RequestMapping(value = "/upsert",method = RequestMethod.POST)
    public ResultDto insertBatch(@RequestBody TeachBook book){
        return ResultDto.toSuccess(bookService.upsert(book));
    }
}