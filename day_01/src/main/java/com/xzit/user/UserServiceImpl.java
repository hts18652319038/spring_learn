package com.xzit.user;

public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        UserDao dao ;
        dao = (UserDao) XmlBeanFactory.getBean("D:\\Program Files\\java_workspace\\springFramework\\day_01\\target\\classes\\bean.xml","userDao");
        dao.save();
    }
}
