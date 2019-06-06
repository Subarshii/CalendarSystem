package com.example.calendasystem.demo.repository;

import com.example.calendasystem.demo.model.NEW.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
