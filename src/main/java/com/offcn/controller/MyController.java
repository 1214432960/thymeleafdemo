package com.offcn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@Controller
public class MyController {

    @GetMapping("/indexPage")
    public String indexPage(Model model){
        model.addAttribute("name","文耀华");
        System.out.println("进入了控制层");
        Map<Object, Object> map = new HashMap<>();
        map.put("one","1.jpg");
        map.put("two","2.jpg");
        model.addAttribute("src",map);
        return "index";

    }
}
