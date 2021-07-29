package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping
  public String getMain(Model model){
    model.addAttribute("pageName", "Home");
    model.addAttribute("pageDescription", "Welcome");
    model.addAttribute("title", "Home");
    return "home";
  }
}
