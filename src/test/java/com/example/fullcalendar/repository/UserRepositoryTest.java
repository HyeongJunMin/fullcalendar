package com.example.fullcalendar.repository;

import com.example.fullcalendar.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

  @Autowired
  private UserRepository userRepository;

  @Test
  void createUser() {
    // given
    String name = "userName";
    User user = new User(name);

    // when
    User savedUser = userRepository.save(user);

    // then
    assertAll(() -> {
      assertThat(user.getName()).isEqualTo(savedUser.getName());
    });
  }

}