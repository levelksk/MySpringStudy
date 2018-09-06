package com.levelksk.beginning.spring.ch2;

import java.util.List;

public interface AccountDao {
    /**
     * 插入新账户
     * @param account 账户实例
     */
    public void insert(Account account);

    /**
     * 更新账户信息
     * @param account 账户实例
     */
    public void update(Account account);

    /**
     * 更新多个账户
     * @param accounts 多个账户列
     */
    public void update(List<Account> accounts);

    /**
     * 删除账户
     * @param accountId 账户id
     */
    public void delete(long accountId);

    /**
     * 找到某个账户
     * @param accountId 账户id
     * @return 账户实例
     */
    public Account find(long accountId);

    /**
     * 根据账户id列找到多个账户列
     * @param accountIds 账户id列
     * @return 多个账户列
     */
    public List<Account> find(List<Account> accountIds);

    /**
     * 根据用户姓名找到拥有的所有账户
     * @param ownerName 用户姓名
     * @return 该用户的所有账户
     */
    public List<Account> find(String ownerName);

    /**
     * 找到符合锁定状态的所有账户
     * @param locked true/false
     * @return 符合锁定状态的所有账户
     */
    public List<Account> find(boolean locked);
}
