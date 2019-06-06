package com.example.calendasystem.demo.controller;

import com.example.calendasystem.demo.model.NEW.Embeddable.Pending;
import com.example.calendasystem.demo.model.NEW.Holiday;
import com.example.calendasystem.demo.repository.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/holiday/")
class HolidayController {
  @Autowired private HolidayRepository holidayRepository;

  public HolidayController(HolidayRepository holidayRepository) {
    this.holidayRepository = holidayRepository;
  }

  @GetMapping("holidayid")
  Optional<Holiday> getHoliday(@PathVariable(name = "holidayid") Integer holidayid) {
    return holidayRepository.findById(holidayid);
  }
    @GetMapping("findAll/")
    List<Holiday> FindAllEmployee(@RequestBody Holiday holiday) {
        return holidayRepository.findAll();
    }
  @PostMapping
  Holiday saveHoliday(@RequestBody Holiday holidaysTosave, @RequestParam Integer employyeeid) {
    Holiday holidays = new Holiday();

    return holidayRepository.save(holidays);
  }

  @PutMapping("{holidayid}")
  @Transactional
  Optional<Holiday> updateDepart(
      @RequestBody Holiday HolidayToUpdate,
      @PathVariable Integer holidayid) {
    Optional<Holiday> holidayOptional = holidayRepository.findById(holidayid);
    holidayOptional.ifPresent(
        holiday -> {
          holiday.setApprovestatus(HolidayToUpdate.getApprovestatus());
          holiday.setDayleave(HolidayToUpdate.getDayleave());
          holiday.setLeavestatus(HolidayToUpdate.getLeavestatus());
          holiday.setPending(new Pending(7,7,7));
          holidayRepository.save(holiday);
        });

    return holidayOptional;
  }
  @DeleteMapping("{holidayid}")
 void  deleteHoliday(@PathVariable(name = "holidayid") Integer holidayid) {

    holidayRepository.deleteById(holidayid);
          }


}
