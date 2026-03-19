package com.xzit.user;

public class Test {
    public static void main(String[] args) {
        /*UserService service = new UserServiceImpl();
        service.save();*/
        Boy boy = (Boy) XmlBeanFactory.getBean("D:\\\\Program Files\\\\java_workspace\\\\springFramework\\\\day_01\\\\target\\\\classes\\\\bean.xml\",\"userDao","boy");
        System.out.println(boy);
    }
}
