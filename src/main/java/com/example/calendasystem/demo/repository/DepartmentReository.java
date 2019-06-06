package com.example.calendasystem.demo.repository;


import com.example.calendasystem.demo.model.NEW.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
public interface DepartmentReository extends JpaRepository<Department,Integer> {

}
