package com.example.fullcalendar.controller;

import com.example.fullcalendar.domain.User;
import com.example.fullcalendar.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserRepository userRepository;
  private final ObjectMapper objectMapper;

  @GetMapping("/user/{id}")
  public String get(@PathVariable String id) throws JsonProcessingException {
    Optional<User> user = userRepository.findById(id);
    return objectMapper.writeValueAsString(user);
  }

}
