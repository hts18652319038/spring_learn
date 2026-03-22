package com.xzit.service.impl;

import com.xzit.dao.ResourceDao;
import com.xzit.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private ResourceDao resourceDao;

    @Override
    public boolean openURL(String url, String password) {
        // 模拟校验
        return resourceDao.readResources(url,password);
    }
}
