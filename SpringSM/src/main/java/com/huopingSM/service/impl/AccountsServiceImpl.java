package com.huopingSM.service.impl;

import com.huopingSM.mapper.AccountsMapper;
import com.huopingSM.pojo.Accounts;
import com.huopingSM.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/*
 *com.huopingSM.service.impl
 *霍平
 *2022/7/16 16 20:10
 */
@Service
//@Transactional(propagation = Propagation.REQUIRED, noRollbackForClassName = {"",""})//添加事务,传播特性,增删改都是走这个,noRollbackForClassName发生这个异常不处理,正常插入数据
@Transactional(propagation = Propagation.REQUIRED, noRollbackForClassName = "ArithmeticException")//添加事务,传播特性,增删改都是走这个
public class AccountsServiceImpl implements AccountsService {
    @Autowired
    AccountsMapper accountsMapper;

    @Override
    public int insert(Accounts accounts) {
        int a = 0;
        a = accountsMapper.insert(accounts);
        System.out.println(1 / 0);
        System.out.println("用户增加成功" + a);
        return a;
    }
}
