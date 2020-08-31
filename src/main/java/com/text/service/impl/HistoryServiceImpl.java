package com.text.service.impl;

import com.text.dao.HistoryDao;
import com.text.po.History;
import com.text.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * @author 王元圣
 */
@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    private HistoryDao historyDao;

    @Override
    public void insertAddHistory(String username, String type, BigDecimal money, Timestamp time) {
        historyDao.insertAddHistory(username, type, money, time);
    }

    @Override
    public ArrayList<History> selectHistory(String username) {
        return historyDao.selectHistory(username);
    }

}
