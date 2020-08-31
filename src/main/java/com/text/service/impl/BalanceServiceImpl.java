package com.text.service.impl;

import com.text.dao.BalanceDao;
import com.text.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author 王元圣
 */
@Service
public class BalanceServiceImpl implements BalanceService {
    @Autowired
    private BalanceDao balanceDao;

    @Override
    public BigDecimal selectBalanceByUsername(String username) {
        return balanceDao.selectBalanceByUsername(username);
    }

    @Override
    public void UpdateAddBalance(String username, BigDecimal money) {
        balanceDao.updateAddBalance(username, money);
    }

    @Override
    public void UpdateDrawBalance(String username, BigDecimal money) {
        balanceDao.updateDrawBalance(username, money);
    }


}
