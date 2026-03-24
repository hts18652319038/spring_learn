package com.xzit;

import com.xzit.config.SpringConfig;
import com.xzit.dao.AccountDao;
import com.xzit.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountDao accountDao;

    @Test
    public void testTransfer() {
        accountService.transfer("Tom","Jerry", 50.0);
        System.out.println("数据库操作执行成功！");
    }

    @Test
    @Transactional(rollbackFor = Exception.class)
    public void testDataSource() {
        // 执行简单的数据库操作，验证是否能正常运行
        accountDao.outMoney("Tom",100.0);
        accountDao.inMoney("Jerry", 100.0);
        System.out.println("数据库操作执行成功！");
    }
}
