package com.xzit.service;

import com.xzit.config.SpringConfig;
import com.xzit.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTestCase {
    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById() {
        Account account = accountService.findById(1);
        System.out.println(account);
    }

    @Test
    public void testFindAll() {
        List<Account> accounts = accountService.findAll();
        /*accounts.forEach(System.out::println);*/
    }
}
