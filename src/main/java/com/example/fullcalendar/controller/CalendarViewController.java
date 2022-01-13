package com.example.fullcalendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalendarViewController {

  @GetMapping("/calendar")
  public String calendarMain() {
    return "calendar/calendar-main";
  }

}
