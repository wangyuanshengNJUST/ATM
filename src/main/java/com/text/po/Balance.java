package com.text.po;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 王元圣
 */
public class Balance implements Serializable {
    private String username;
    private BigDecimal balance;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
