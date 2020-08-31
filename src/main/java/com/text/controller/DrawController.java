package com.text.controller;

import com.text.service.BalanceService;
import com.text.service.HistoryService;
import com.text.utils.JDBCUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.sql.*;
import java.util.Date;

/**
 * @author 王元圣
 */
@Controller
@RequestMapping("/demo")
public class DrawController {
    @Autowired
    private BalanceService balanceService;
    @Autowired
    private HistoryService historyService;

    @RequestMapping("/draw")
    public String Demo1(String username, Model model) {
        model.addAttribute("username", username);
        return "draw";
    }

    @RequestMapping("/draw1")
    public String save(String username, String money, Model model) {
        BigDecimal money1 = new BigDecimal(money);
        BigDecimal balance = balanceService.selectBalanceByUsername(username);
        if (balance.compareTo(money1) < 0) {
            return "error1";
        }
        model.addAttribute("username", username);
        balanceService.UpdateDrawBalance(username, money1);
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        historyService.insertAddHistory(username, "取款", money1, time);
        return "succ";
    }
}

