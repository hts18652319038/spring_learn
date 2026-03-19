package com.xzit.factory;

import com.xzit.UserDao;
import com.xzit.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
