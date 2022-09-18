package com.eroldmr.sbt.controllers;

import com.eroldmr.sbt.data.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/home"})
public class ApplicationController {

    @GetMapping
    public String home(Model model) {
        model.addAttribute("pageTitle", "Home");
        return "home";
    }

    @GetMapping("about")
    public String about(Model model) {
        model.addAttribute("pageTitle", "About");
        model.addAttribute("people", new Data().getPeople());
        return "about";
    }
}
