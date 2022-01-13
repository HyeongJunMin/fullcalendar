package com.example.fullcalendar.repository;

import com.example.fullcalendar.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
