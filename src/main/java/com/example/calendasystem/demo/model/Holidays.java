package com.example.calendasystem.demo.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "HOLIDAYS_CALENDAR")
public class Holidays {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "holiday_id")
  //  @SequenceGenerator(name = "holiday_id", allocationSize = 1, sequenceName = "HOLIDAY_ID")
  private Integer holidayid;

  private Integer worktime;

  private Integer dayleave;

  @Enumerated(EnumType.STRING)
  private LeaveType leavetype;
//
//  @ManyToOne
//  private User user;

//  public User getUser() {
//    return user;
//  }
//
//  public void setUser(User user) {
//    this.user = user;
//  }

  public Holidays() {}

  public Integer getHolidayid() {
    return holidayid;
  }

  public void setHolidayid(Integer holidayid) {
    this.holidayid = holidayid;
  }

  public LeaveType getLeavetype() {
    return leavetype;
  }

  public void setLeavetype(LeaveType leavetype) {
    this.leavetype = leavetype;
  }

  public Integer getHolidays() {
    if (worktime > 3) {
      return dayleave = 7;
    }
    if (worktime > 12) {
      if (worktime % 12 == 0) {
        dayleave++;
      }
      return worktime;
    }
    return worktime;
  }

  public Integer getWorktime() {
    return worktime;
  }

  public void setWorktime(Integer worktime) {
    this.worktime = worktime;
  }

  public Integer getDayleave() {
    return dayleave;
  }

  public void setDayleave(Integer dayleave) {
    this.dayleave = dayleave;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Holidays holidays = (Holidays) o;
    return Objects.equals(holidayid, holidays.holidayid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holidayid);
  }


}
