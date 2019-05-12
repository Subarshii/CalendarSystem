package com.example.calendasystem.demo;

import com.example.calendasystem.demo.model.User;
import com.example.calendasystem.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
  private UserRepository userRepository;

  @Autowired
  public void userRepository(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//
//    User user = new User();
//    user.setUsername("Test1234");
//    user.setPassword("123456");
//    user.setFirstname("Chatchai");
//    user.setLastname("Tiwaworawong");
//    user.setDepartmentid(1);
//    user.setEmail("s14_110@hotmail.com");
//    user.setPhone((long) 980357093);
//    user.setHolidayid(2);
//    user.setWorkstart(LocalDate.of(2019, Month.MAY, 10));
//    user.setDescription("TEST database");
//    userRepository.save(user);
  }
}


