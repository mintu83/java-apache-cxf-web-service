package com.apache.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.apache.model.BookVO;

@WebService
public interface BookShelfService {
    @WebMethod
    public  String insertBook(BookVO bookVO);
    @WebMethod
    public  BookVO getBook(String title);
}
