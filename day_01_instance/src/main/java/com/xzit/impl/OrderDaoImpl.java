package com.xzit.impl;

import com.xzit.OrderDao;

public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("order dao save ...");
    }
}
