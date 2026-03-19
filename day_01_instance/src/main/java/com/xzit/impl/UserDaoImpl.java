package com.xzit.impl;

import com.xzit.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao save ....");
    }
}
