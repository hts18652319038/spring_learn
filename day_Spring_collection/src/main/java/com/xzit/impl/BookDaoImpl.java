package com.xzit.impl;

import com.xzit.BookDao;

import java.util.*;

public class BookDaoImpl implements BookDao {
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        System.out.println("===== BookDaoImpl 属性值打印 =====");
        // 数组：用Arrays.toString()避免打印内存地址
        System.out.println("array数组值: " + Arrays.toString(array));
        // List集合：直接打印即可
        System.out.println("list集合值: " + list);
        // Set集合：直接打印即可
        System.out.println("set集合值: " + set);
        // Map集合：直接打印即可
        System.out.println("map集合值: " + map);
        // Properties：可以直接打印，也可以遍历打印（更清晰）
        System.out.println("properties配置值（直接打印）: " + properties);
        // 可选：遍历Properties，按key-value格式打印
        System.out.println("properties配置值（遍历打印）: ");
        if (properties != null) {
            properties.forEach((k, v) -> System.out.println("  " + k + " = " + v));
        }
        System.out.println("===============================");
    }

    @Override
    public String toString() {
        return "BookDaoImpl{" +
                "array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
