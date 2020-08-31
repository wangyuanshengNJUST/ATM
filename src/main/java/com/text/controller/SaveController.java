package com.text.controller;

import com.text.po.History;
import com.text.service.BalanceService;
import com.text.service.HistoryService;
import com.text.utils.JDBCUtils;
import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 王元圣
 */
@Controller
@RequestMapping("/demo")
public class SaveController {
    @Autowired
    private BalanceService balanceService;
    @Autowired
    private HistoryService historyService;

    @RequestMapping("/save")
    public String Demo1(String username, Model model) {
        model.addAttribute("username", username);
        return "save";
    }

    @RequestMapping("/save1")
    public String save(String username, String money, Model model) {
        BigDecimal money1 = new BigDecimal(money);
        model.addAttribute("username", username);
        balanceService.UpdateAddBalance(username, money1);
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        historyService.insertAddHistory(username, "存款", money1, time);
        return "succ";
    }
}
