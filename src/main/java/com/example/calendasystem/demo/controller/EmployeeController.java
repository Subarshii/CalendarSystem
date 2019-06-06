package com.example.calendasystem.demo.controller;

import com.example.calendasystem.demo.model.NEW.Employee;
import com.example.calendasystem.demo.repository.DepartmentReository;
import com.example.calendasystem.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/employee/")
class EmployeeController {
  @Autowired private EmployeeRepository employeeRepository;
  private DepartmentReository departmentReository;

  EmployeeController(
      EmployeeRepository employeeRepository, DepartmentReository departmentReository) {
    this.departmentReository = departmentReository;
    this.employeeRepository = employeeRepository;
  }

  @GetMapping("{employeeid}")
  Optional<Employee> getEmployee(@PathVariable(name = "employeeid") Integer employeeid) {
    return employeeRepository.findById(employeeid);
  }

  @GetMapping
  List<Employee> findAll() {
    return employeeRepository.findAll();
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
  @Transactional
  Employee createEmployee(@RequestBody Employee saveEmployee) {

    return employeeRepository.save(saveEmployee);
  }

  @PutMapping("{employeeid}")
  ResponseEntity<Employee> updateEmployee(
      @RequestBody Employee employeeToUpdate, @PathVariable Integer employeeid) {
    Optional<Employee> foundOptional = employeeRepository.findById(employeeid);
    foundOptional.ifPresent(
        employee -> {
          employeeToUpdate.setEmployeeid(employeeid);
          employeeRepository.save(employeeToUpdate);
        });

    return ResponseEntity.noContent().build();
  }

  @DeleteMapping("{employeeid}")
  void deleteEmployee(@PathVariable(name = "employeeid") Integer employeeid) {
    employeeRepository.deleteById(employeeid);
  }
}
