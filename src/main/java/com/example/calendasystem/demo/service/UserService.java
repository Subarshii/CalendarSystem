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
    user1.setFirstname("Chatchai");
    user1.setLastname("Tiwaworawong");
    user1.setDepartmentid(1);
    user1.setEmail("s14_110@hotmail.com");
    user1.setPhone((long) 980357093);
    user1.setHolidayid(2);
    user1.setWorkstart(LocalDate.of(2019, Month.MAY, 10));
    user1.setDescription("TEST database");
    return userRepository.save(user);
  }

  public Optional<User> deleteUserById(Integer userId) {
    userRepository.deleteById(userId);
    return userRepository.findById(userId);
  }
}
