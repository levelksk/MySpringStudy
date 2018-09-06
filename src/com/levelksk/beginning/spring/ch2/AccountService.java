package com.levelksk.beginning.spring.ch2;

public interface AccountService {
    /**
     * 转移资产
     * @param sourceAccountId 资产流出账户id
     * @param targetAccountId 资产流入账户id
     * @param amount 金额
     */
    public void transferMoney(long sourceAccountId, long targetAccountId, double amount);

    /**
     * 存入金额
     * @param accountId 账户id
     * @param amount 金额
     * @throws Exception
     */
    public void depositMoney(long accountId, double amount) throws Exception;

    /**
     * 获取账户
     * @param accountId 账户id
     * @return 账户实例
     */
    public Account getAccount(long accountId);
}
