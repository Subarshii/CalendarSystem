package com.example.calendasystem.demo.repository;


import com.example.calendasystem.demo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentReository extends JpaRepository<Department,Integer> {
}
