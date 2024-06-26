package com.zjyun.spring_ioc.e_基于XML的spring;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Description:
 * @Author: Wang Zijian
 * @Date: 2024/5/30
 */
@AllArgsConstructor
@NoArgsConstructor
public class MyServiceImpl implements MyService, InitializingBean {


    private Person person;

    public void init() {
        System.out.println();
    }
    public void destory() {
        System.out.println();
    }

    @Override
    public void print() {
        System.out.println("print!!!");
    }

    public void setPerson(Person person) {
        System.out.println("设置Person属性！");
        this.person = person;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("在属性配置后执行~ 通过InitializingBean#afterPropertiesSet()方法设置！");
    }
}
