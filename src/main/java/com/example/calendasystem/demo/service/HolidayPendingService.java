//package com.example.calendasystem.demo.service;
//
//import com.example.calendasystem.demo.model.HolidayPending;
//import com.example.calendasystem.demo.repository.NOTUSE.HolidayPendingRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//public class HolidayPendingService {
//    @Autowired
//    private HolidayPendingRepository holidayPendingRepository;
//
//    public List getAllHolidayPending() {
//        List pending = new ArrayList<>();
//        holidayPendingRepository.findAll().forEach(pending::add);
//        return pending;
//    }
//
//    public Optional<HolidayPending> getPendingById(Integer pendingId) {
//        return holidayPendingRepository.findById(pendingId);
//    }
//
//    public HolidayPending setpending(HolidayPending pending) {
//        return holidayPendingRepository.save(pending);
//    }
//
//    public Optional<HolidayPending> deletependingmentById(Integer pendingId) {
//        holidayPendingRepository.deleteById(pendingId);
//        return holidayPendingRepository.findById(pendingId);
//    }
//
//}
