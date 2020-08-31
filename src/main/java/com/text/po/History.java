package com.text.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author 王元圣
 */
public class History implements Serializable {
    private String username;
    private String type;
    private BigDecimal money;
    private Timestamp   time;

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "History{" +
                "username='" + username + '\'' +
                ", type=" + type +
                ", money=" + money +
                ", time=" + time +
                '}';
    }
}
