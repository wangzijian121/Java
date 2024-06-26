package com.zjyun.spring_ioc.c_bean的实例化.d_通过factoryBean接口;

/**
 * @Description:
 * @Author: Wang Zijian
 * @Date: 2024/5/31
 */

public class Bean {

    private String name;

    public Bean() {
    }

    public Bean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "name='" + name + '\'' +
                '}';
    }
}
