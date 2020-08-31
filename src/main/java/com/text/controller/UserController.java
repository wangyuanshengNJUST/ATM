package com.text.controller;

import com.text.service.BalanceService;
import com.text.service.HistoryService;
import com.text.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.*;
import java.util.Date;

/**
 * @author 王元圣
 */
@Controller
@RequestMapping("/demo")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private BalanceService balanceService;
    @Autowired
    private HistoryService historyService;

    @RequestMapping("/login")
    public String run2(String username, String password, Model model) {
        model.addAttribute("username", username);
        String password1 = userService.selectUserByUsername(username);
        int isdelete = userService.selesttypeByUsername(username);
        /*用户不存在*/
        if (password1 == null || isdelete == 1) {
            return "error";
        }
        /*验证密码*/
        if (password1.equals(password)) {
            return "succ";
        } else {
            return "error";
        }
    }

    @RequestMapping("/logout")
    public String logout(String username, Model model) {
        model.addAttribute("username", username);
        userService.updateType(username);

        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());
        historyService.insertAddHistory(username, "注销取款", balanceService.selectBalanceByUsername(username), time);

        balanceService.UpdateDrawBalance(username, balanceService.selectBalanceByUsername(username));
        return "login";
        // return "redirect:/index.jsp";
    }

    @RequestMapping("/beforlogin")
    public String befor() {
        return "login";
    }

    @RequestMapping("/exit")
    public String exit() {
        return "login";
    }
}