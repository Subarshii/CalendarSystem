package com.example.calendasystem.demo.controller;

import com.example.calendasystem.demo.model.NEW.Department;
import com.example.calendasystem.demo.repository.DepartmentReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sun.net.www.http.HttpClient;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/depart/")
class DepartController {

  private DepartmentReository departmentReository;

  @Autowired
  void DepartmentRepository(DepartmentReository departmentReository) {
    this.departmentReository = departmentReository;
  }

  @GetMapping(path = "{departmentid}")
  Optional<Department> getDepart(@PathVariable(name = "departmentid") Integer departmentid) {
    return departmentReository.findById(departmentid);
  }

  @GetMapping
  List<Department> findAll() {
    return departmentReository.findAll();
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
  @Transactional
  Department createDepartment(@RequestBody Department departToSave) {
    return departmentReository.save(departToSave);
  }

  @PutMapping("{departmentid}")
  Optional<Department> updateDepart(
      @RequestBody Department departToUpdate, @PathVariable Integer departmentid) {
    Optional<Department> departOptional = departmentReository.findById(departmentid);
    departOptional.ifPresent(
        depart -> {
          depart.setDepartment(departToUpdate.getDepartment());
          departmentReository.save(depart);
        });
    return departOptional;
  }

  @DeleteMapping("{departmentid}")
  void deleteDepartment(@PathVariable Integer departmentid) {

    departmentReository.deleteById(departmentid);
  }
}
