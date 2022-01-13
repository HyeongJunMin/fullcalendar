package com.example.fullcalendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestViewController {

  @GetMapping("/")
  public String what() {
    return "index";
  }

}
