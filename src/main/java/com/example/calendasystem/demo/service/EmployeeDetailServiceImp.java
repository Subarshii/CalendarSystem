//package com.example.calendasystem.demo.service;
//
//import com.example.calendasystem.demo.model.NEW.Employee;
//import com.example.calendasystem.demo.repository.DepartmentReository;
//import com.example.calendasystem.demo.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.Optional;
//
//@Service
//public class EmployeeDetailServiceImp implements EmployeeService {
//
//  @Autowired private EmployeeRepository employeeRepository;
//  private DepartmentReository departmentReository;
//  private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//  public EmployeeDetailServiceImp(
//      EmployeeRepository employeeRepository, DepartmentReository departmentReository) {
//    this.employeeRepository = employeeRepository;
//    this.departmentReository = departmentReository;
//  }
//
//  @Override
//  @Transactional
//  public Employee save(Employee saveEmployee, @RequestParam Integer departmentid) {
//      Employee employees = new Employee();
//      employees.setPassword(bCryptPasswordEncoder.encode(Employee.()));
//      employees.setDepartment(departmentReository.getOne(departmentid));
//      employees.setAddress(saveEmployee.getAddress());
//      employees.setAge(saveEmployee.getAge());
//      employees.setBirthday(saveEmployee.getBirthday());
//      employees.setEmail(saveEmployee.getEmail());
//      employees.setFirstname(saveEmployee.getFirstname());
//      employees.setLastname(saveEmployee.getLastname());
//      employees.setNickname(saveEmployee.getNickname());
//      employees.setPhone(saveEmployee.getPhone());
//      employees.setWorktimestart(saveEmployee.getWorktimestart());
//      return employeeRepository.save(employees);
//  }
//
//  @Override
//  public Employee findByUsername(Integer employeeid) {
//    return null;
//  }
//
//  @Override
//  public void delete(Integer employeeid) {
//      departmentReository.deleteById(employeeid);
//  }
//}
