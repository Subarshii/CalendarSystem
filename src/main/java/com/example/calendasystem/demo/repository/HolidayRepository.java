package com.example.calendasystem.demo.repository;

import com.example.calendasystem.demo.model.NEW.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidayRepository extends JpaRepository<Holiday, Integer> {}
