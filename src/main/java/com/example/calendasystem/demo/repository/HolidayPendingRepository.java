package com.example.calendasystem.demo.repository;

import com.example.calendasystem.demo.model.HolidayPending;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidayPendingRepository extends JpaRepository<HolidayPending, Integer> {}
