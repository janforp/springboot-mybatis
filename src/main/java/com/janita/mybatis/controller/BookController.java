package com.janita.mybatis.controller;


import com.janita.mybatis.bean.TeachBook;
import com.janita.mybatis.constant.ResultDto;
import com.janita.mybatis.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @ClassName BookController
 * @author janita
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private IBookService userService;

    @RequestMapping(value = "/addBook",method = RequestMethod.POST)
    public ResultDto createBook(@RequestBody TeachBook book){
        userService.createBook(book);
        return ResultDto.toSuccess("添加课本成功");
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ResultDto test(){
        return ResultDto.toSuccess("成功");
    }
}