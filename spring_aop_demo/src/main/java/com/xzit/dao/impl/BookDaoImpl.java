package com.xzit.dao.impl;

import com.xzit.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void delete() {
        System.out.println("Book dao delete ...");
    }

    @Override
    public void save() {
        // 记录程序当前执行（开始时间）
        Long startTime = System.currentTimeMillis();
        // 业务执行百万次
        for (int i = 0; i < 10000; i++) {
            System.out.println("Book dao save ...");
        }
        // 记录程序当前执行时间（结束时间）
        Long endTime = System.currentTimeMillis();
        // 计算时间差
        Long totalTime = endTime - startTime;
        // 输出信息
        System.out.println("百万耗时: " + totalTime + "ms");
    }

    @Override
    public void update() {
        System.out.println("Book dao update ...");
    }
}
