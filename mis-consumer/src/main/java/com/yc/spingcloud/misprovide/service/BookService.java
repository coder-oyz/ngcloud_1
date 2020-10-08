package com.yc.spingcloud.misprovide.service;

import com.yc.spingcloud.misprovide.bean.Book;
import lombok.Data;


public interface  BookService   {
    public Book getBook(Integer id);
}
