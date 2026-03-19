package com.xzit.user;

import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class BeanFactory {
    public static UserDao getDaoImpl(String className) {
        ResourceBundle bundle = ResourceBundle.getBundle("bean");
        String userDao = bundle.getString("userDao");
        try {
            Class<?> aClass = Class.forName(userDao);
            return (UserDao)aClass.getConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
