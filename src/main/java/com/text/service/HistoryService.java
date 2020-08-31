package com.text.service;

import com.text.po.History;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * @author 王元圣
 */
public interface HistoryService {
    public void insertAddHistory(String username, String type, BigDecimal money, Timestamp time);
    public ArrayList<History> selectHistory(String username);
}
