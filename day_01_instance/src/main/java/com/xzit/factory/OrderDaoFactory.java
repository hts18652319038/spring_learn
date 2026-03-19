package com.xzit.factory;

import com.xzit.OrderDao;
import com.xzit.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("factory setup ....");
        return new OrderDaoImpl();
    }
}
