package com.apache.serviceImpl;

import javax.jws.WebService;

import com.apache.model.BookVO;
import com.apache.service.BookShelfService;

@WebService(endpointInterface = "com.apache.service.BookShelfService",
serviceName="pratima")
public class BookShelfServiceImpl implements BookShelfService {
public String insertBook(BookVO bookVO) {

return "Book with name : Test Book is now available on the shelf";  //To change body of implemented methods use File | Settings | File Templates.
}

public BookVO getBook(String title) {
	BookVO bookVO = new BookVO();
	bookVO.setBookName("Apache CXF Webservice Hello World");
	bookVO.setAuthor("Test author : Mintu Mazumder");
return bookVO;  //To change body of implemented methods use File | Settings | File Templates.
}
}
