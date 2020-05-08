package com.mmz.service.impl;

import com.mmz.dao.AccountDao;
import com.mmz.dao.impl.AccountDaoImpl;
import com.mmz.service.AccountService;

/**
 * @Classname AccountServiceImpl
 * @Description 账户的业务层实现类
 * @Date 2020/5/7 21:34
 * @Created by mmz
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao = new AccountDaoImpl();

    public AccountServiceImpl() {
        System.out.println("对象创建了");
    }

    public void saveAccount(){
        accountDao.saveAccount();
    }
}
