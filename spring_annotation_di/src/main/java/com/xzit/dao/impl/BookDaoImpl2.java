package com.xzit.dao.impl;

import com.xzit.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDaoImpl2 save ...");
    }
}
