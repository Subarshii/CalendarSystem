package com.example.calendasystem.demo.controller;

import com.example.calendasystem.demo.model.Department;
import com.example.calendasystem.demo.model.HolidayPending;
import com.example.calendasystem.demo.model.Holidays;
import com.example.calendasystem.demo.model.User;
import com.example.calendasystem.demo.repository.UserRepository;
import com.example.calendasystem.demo.service.DepartmentService;
import com.example.calendasystem.demo.service.HolidayPendingService;
import com.example.calendasystem.demo.service.HolidayService;
import com.example.calendasystem.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/user/")
public class UserController {

  private UserRepository userRepository;

  @Autowired
  public void userRepository(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @RequestMapping(path = "{userId}", method = RequestMethod.GET)
  public Optional<User> getUser(@PathVariable(name = "userId") Integer userId) {
    return userRepository.findById(userId);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public void saveUser(@RequestBody User userToSave) throws NoSuchMethodException {
    UserService.class.getMethod("setUser", User.class);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public void saveDepartment(@RequestBody Department departToSave) throws NoSuchMethodException {
    DepartmentService.class.getMethod("setDepartmet", Department.class);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public void saveHolidayPending(@RequestBody HolidayPending PendingToSave)
      throws NoSuchMethodException {
    HolidayPendingService.class.getMethod("setpending", HolidayPending.class);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public void saveHoliday(@RequestBody Holidays HoidayToSave) throws NoSuchMethodException {
    HolidayService.class.getMethod("setholidays", Holidays.class);
  }
}
