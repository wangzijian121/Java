package com.zjyun.spring官方文档.Aop.AOP的应用.事务控制_整合mybatis;

import com.zjyun.spring官方文档.Aop.AOP的应用.事务控制_整合mybatis.model.Account;

/**
 * @Description:
 * @Author: Wang Zijian
 * @Date: 2024/6/18
 */
public interface AccountService {


    void transfer(Account Sender, Account recipient, long amount);

    Account getAccount(int id);
}
