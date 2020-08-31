package com.text.controller;

import com.text.service.BalanceService;
import com.text.utils.JDBCUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 王元圣
 */
@Controller
@RequestMapping("/demo")
public class CheckBalanceController {
    @Autowired
    private BalanceService balanceService;

    @RequestMapping("/Check")
    public String demo1(String username, Model model) {
        BigDecimal balance = balanceService.selectBalanceByUsername(username);
        model.addAttribute("balance", balance);
        return "succes";
    }
}
