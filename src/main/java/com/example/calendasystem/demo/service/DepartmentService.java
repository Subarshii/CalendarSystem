package com.example.calendasystem.demo.service;

import com.example.calendasystem.demo.model.Department;
import com.example.calendasystem.demo.repository.DepartmentReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
  @Autowired private DepartmentReository departmentReository;

  public List getAllDepartment() {
    List depart = new ArrayList<>();
    departmentReository.findAll().forEach(depart::add);
    return depart;
  }

  public Optional<Department> getDepartmentById(Integer departId) {
    return departmentReository.findById(departId);
  }

  public Department setDepartmet(Department depart) {
    Department programmer = new Department();
    programmer.setDepartment("Programmer");
    programmer.setDescription("This is a programmer department");

    Department sale = new Department();
    sale.setDepartment("Sale");
    sale.setDescription("This is a sale department");

    Department systemAnalysis = new Department();
    systemAnalysis.setDepartment("System Analysis");
    systemAnalysis.setDescription("This is a system analysis department");

    return departmentReository.save(depart);
  }

  public Optional<Department> deleteDepartmentById(Integer departId) {
    departmentReository.deleteById(departId);
    return departmentReository.findById(departId);
  }
}
