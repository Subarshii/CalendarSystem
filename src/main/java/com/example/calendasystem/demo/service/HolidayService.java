package com.example.calendasystem.demo.service;

import com.example.calendasystem.demo.model.Holidays;
import com.example.calendasystem.demo.model.LeaveType;
import com.example.calendasystem.demo.repository.HolidaysRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HolidayService {
    @Autowired
    private HolidaysRepository holidaysRepository;

    public List getAllHoliday() {
        List holidays = new ArrayList<>();
        holidaysRepository.findAll().forEach(holidays::add);
        return holidays;
    }

    public Optional<Holidays> getHolidayById(Integer holidayId) {
        return holidaysRepository.findById(holidayId);
    }

    public Holidays setholidays(Holidays holidays) {
        Holidays holidays1 = new Holidays();
        holidays1.setHolidayid(9999);
        holidays1.setWorktime(15);
        holidays1.getDayleave();
        holidays1.setLeavetype(LeaveType.HOLIDAY);
        return holidaysRepository.save(holidays);
    }

    public Optional<Holidays> deleteholidaysById(Integer holidayId) {
        holidaysRepository.deleteById(holidayId);
        return holidaysRepository.findById(holidayId);
    }
}
