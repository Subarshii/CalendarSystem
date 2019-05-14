package com.example.calendasystem.demo.controller;

import com.example.calendasystem.demo.model.Department;
import com.example.calendasystem.demo.model.HolidayPending;
import com.example.calendasystem.demo.model.Holidays;
import com.example.calendasystem.demo.model.User;
import com.example.calendasystem.demo.repository.DepartmentReository;
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
@RequestMapping("/api/depart/")
public class DepartController {

  private DepartmentReository departmentReository;

  @Autowired
  public void DepartmentReository(DepartmentReository departmentReository) {
    this.departmentReository = departmentReository;
  }

  @RequestMapping(path = "{departmentid}", method = RequestMethod.GET)
  public Optional<Department> getDepart(@PathVariable(name = "departmentid") Integer departmentid) {
    return departmentReository.findById(departmentid);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public Department saveDepartment(@RequestBody Department departToSave) {
    return departmentReository.save(departToSave);
  }
  //
  //
  //
  //  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  //  public void saveHoliday(@RequestBody Holidays HoidayToSave) throws NoSuchMethodException {
  //    HolidayService.class.getMethod("setholidays", Holidays.class);
  //  }
}
