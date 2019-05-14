package com.example.calendasystem.demo.service;

import com.example.calendasystem.demo.model.User;
import com.example.calendasystem.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
  @Autowired private UserRepository userRepository;

  public List getAllUsers() {
    List user = new ArrayList<>();
    userRepository.findAll().forEach(user::add);
    return user;
  }

  public Optional<User> getUserById(Integer userId) {
    return userRepository.findById(userId);
  }

  public User setUser(User user) {

    User user1 = new User();
    user1.setUsername("Test02");
    user1.setPassword("123456");
    user1.setFirstname("TETST");
    user1.setLastname("wee");
    user1.setDepartmentid(541);
    user1.setEmail("1111@hotmail.com");
    user1.setPhone((long) 123456789);
    user1.setHolidayid(7);
    user1.setWorkstart(LocalDate.of(2019, Month.MAY, 10));
    user1.setDescription("TEST database 2");
    return userRepository.save(user1);
  }

  public Optional<User> deleteUserById(Integer userId) {
    userRepository.deleteById(userId);
    return userRepository.findById(userId);
  }
}
