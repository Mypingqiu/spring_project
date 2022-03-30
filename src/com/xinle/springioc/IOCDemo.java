package com.xinle.springioc;

/**
 * Copyright (c) 2008-2028 考呀呀 All Rights Reserved
 *
 * @Project: springtest.java
 * @Package: com.xinle.springioc
 * @Mail: 18338456560@163.com
 * @Version: V1.0
 * @TODO: Created by cxl on 2022/3/30 9:46 AM
 */
public class IOCDemo {

    private String message;

    public void getMessage() {
        System.out.println("message ："+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
