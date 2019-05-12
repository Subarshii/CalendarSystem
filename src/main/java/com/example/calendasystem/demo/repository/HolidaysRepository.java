package com.example.calendasystem.demo.repository;

import com.example.calendasystem.demo.model.Holidays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidaysRepository extends JpaRepository<Holidays, Integer> {}
