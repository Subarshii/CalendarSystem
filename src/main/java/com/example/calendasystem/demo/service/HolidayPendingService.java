package com.example.calendasystem.demo.service;

import com.example.calendasystem.demo.model.HolidayPending;
import com.example.calendasystem.demo.model.LeaveType;
import com.example.calendasystem.demo.model.StatusType;
import com.example.calendasystem.demo.repository.HolidayPendingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HolidayPendingService {
    @Autowired
    private HolidayPendingRepository holidayPendingRepository;

    public List getAllHolidayPending() {
        List pending = new ArrayList<>();
        holidayPendingRepository.findAll().forEach(pending::add);
        return pending;
    }

    public Optional<HolidayPending> getPendingById(Integer pendingId) {
        return holidayPendingRepository.findById(pendingId);
    }

    public HolidayPending setpending(HolidayPending pending) {
        HolidayPending holidayPending = new HolidayPending();
        holidayPending.setPendingid(1234);
        holidayPending.setDatecreate(LocalDate.from(LocalDate.now()));
        holidayPending.setLeavefrom(LocalDate.from(LocalDate.now()));
        holidayPending.setLeaveto(LocalDate.from(LocalDate.now()));
        holidayPending.setLeavetype(LeaveType.SICK);
        holidayPending.setStatustype(StatusType.APPROVE);
        return holidayPendingRepository.save(pending);
    }

    public Optional<HolidayPending> deletependingmentById(Integer pendingId) {
        holidayPendingRepository.deleteById(pendingId);
        return holidayPendingRepository.findById(pendingId);
    }

}
