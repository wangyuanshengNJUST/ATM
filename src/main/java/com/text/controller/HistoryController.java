package com.text.controller;

import com.text.po.History;
import com.text.service.HistoryService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/demo")
public class HistoryController {
    @Autowired
    private HistoryService historyService;
@RequestMapping("/history")
    public String findHistory(String username, Model model){
       ArrayList<History> histories = historyService.selectHistory(username);
         model.addAttribute("histories", histories);
         return "history";
    }
}
