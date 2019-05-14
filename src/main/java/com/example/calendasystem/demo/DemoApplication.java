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
      User user = new User();
      user.setUsername("QQQQ");
      user.setPassword("1234");
      user.setFirstname("11");
      user.setLastname("1");
      user.setDepartmentid(444);
      user.setEmail("1111@gmail.com");
      user.setPhone((long) 123456789);
      user.setHolidayid(7);
      user.setWorkstart(LocalDate.of(2019, Month.MAY, 10));
      user.setDescription("TEST database 2");
      userRepository.save(user);
  }
}


