package com.example.Thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {

    @GetMapping("/fragment")
    public String fragment() {

        return "fragment/main";
    }

    @GetMapping("/layout")
    public String layout() {

        return "layout/main";
    }
    @GetMapping("/extend")
    public String extend() {

        return "extend/main";
    }
}