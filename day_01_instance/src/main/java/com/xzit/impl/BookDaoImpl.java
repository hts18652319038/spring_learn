package com.xzit.impl;

import com.xzit.BookDao;

public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("book dao constructor is running ....");
    }
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
