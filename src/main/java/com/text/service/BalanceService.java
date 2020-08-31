package com.text.service;

import java.math.BigDecimal;

/**
 * @author 王元圣
 */
public interface BalanceService {
    public BigDecimal selectBalanceByUsername(String username);

    public void UpdateAddBalance(String username, BigDecimal money);

    public void UpdateDrawBalance(String username, BigDecimal money);
}
