package com.xzit.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface AccountService {
    /**
     * 转账操作
     * @param out 传出方
     * @param in 传入方
     * @param money
     */
    @Transactional(rollbackFor = {IOException.class})
    public void transfer(String out,String in,Double money) throws IOException;
}
