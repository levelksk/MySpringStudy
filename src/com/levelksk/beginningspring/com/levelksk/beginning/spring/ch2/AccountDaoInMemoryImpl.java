package com.levelksk.beginningspring.com.levelksk.beginning.spring.ch2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountDaoInMemoryImpl implements AccountDao {

    private Map<Long, Account> accountsMap = new HashMap<>();

    {
        Account account1 = new Account();
        account1.setId(1L);
        account1.setOwnerName("John");
        account1.setBalance(10.0);

        Account account2 = new Account();
        account2.setId(2L);
        account2.setOwnerName("Mary");
        account2.setBalance(20.0);

        accountsMap.put(account1.getId(), account1);
        accountsMap.put(account2.getId(), account2);
    }

    @Override
    public void insert(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public void update(Account account) {
        accountsMap.put(account.getId(), account);
    }

    @Override
    public Account find(long accountId) {
        return accountsMap.get(accountId);
    }

    @Override
    public void update(List<Account> accounts) {
        for (Account account : accounts)
            accountsMap.put(account.getId(), account);
    }

    @Override
    public void delete(long accountId) {
        accountsMap.remove(accountId);
    }

    @Override
    public List<Account> find(List<Account> accountIds) {
        List<Account> accounts = new ArrayList<>();
        for (Account account : accountIds)
            accounts.add(account);
        return accounts;
    }

    @Override
    public List<Account> find(String ownerName) {
        List<Account> accounts = new ArrayList<>();
        for(Long id : accountsMap.keySet()) {
            if (accountsMap.get(id).getOwnerName() == ownerName)
                accounts.add(accountsMap.get(id));
        }
        return accounts;
    }

//    @Override
//    public List<Account> find(boolean locked) {
//
//    }

}
