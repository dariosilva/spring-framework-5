package com.dams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/", "/index"})
    public String getIndexPage() {
        System.out.println("abc");
        return "index";
    }
}
