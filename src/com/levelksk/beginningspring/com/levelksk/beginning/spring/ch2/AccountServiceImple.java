package com.levelksk.beginningspring.com.levelksk.beginning.spring.ch2;

public class AccountServiceImple implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


}
