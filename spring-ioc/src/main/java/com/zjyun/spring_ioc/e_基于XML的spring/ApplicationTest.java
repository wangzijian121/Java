package com.zjyun.spring_ioc.e_基于XML的spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: Wang Zijian
 * @Date: 2024/5/30
 */
public class ApplicationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("基于XML的spring\\applicationContext.xml");
        MyService service1 =(MyService) context.getBean("MyServiceImpl");
        MyService service2 =(MyService) context.getBean("MyServiceImpl");
        MyService service3 =(MyService) context.getBean("MyServiceImpl");
        System.out.println(service1);
        System.out.println(service2);
        System.out.println(service3);
        //调用销毁方法
        context.close();
    }
}
