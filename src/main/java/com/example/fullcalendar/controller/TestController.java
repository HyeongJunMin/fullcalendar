package com.example.fullcalendar.controller;

import com.example.fullcalendar.domain.User;
import com.example.fullcalendar.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

  private final UserRepository userRepository;

  @GetMapping("/test")
  public String test() {
    return "ok";
  }

  @GetMapping("/test/createUser")
  public String testCreateUser(@RequestParam(required = false) String name) {
    User user = new User(name);
    userRepository.save(user);
    return "ok";
  }

  @GetMapping("/test/getUser")
  public String testGetUser() {
    List<User> all = userRepository.findAll();
    return all.toString();
  }

}
