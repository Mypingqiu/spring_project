package com.xinle.springioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Copyright (c) 2008-2028 考呀呀 All Rights Reserved
 *
 * @Project: springtest.java
 * @Package: com.xinle.springioc
 * @Mail: 18338456560@163.com
 * @Version: V1.0
 * @TODO: Created by cxl on 2022/3/30 9:52 AM
 */
public class MainApp {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
        IOCDemo obj = context.getBean("helloWorld", IOCDemo.class);
        obj.getMessage();
        //测试修改
    }
}
