package com.example.calendasystem.demo.model.NEW;

import com.example.calendasystem.demo.model.NEW.Embeddable.Pending;
import com.example.calendasystem.demo.model.NEW.Enum.ApproveStatus;
import com.example.calendasystem.demo.model.NEW.Enum.LeaveStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "HOLIDAY")
public class Holiday implements Serializable {
  @Id
  @GeneratedValue(generator = "HolidayIdGenerator", strategy = GenerationType.AUTO)
  private Integer holidayid;

  private LocalDate dayleave;

  @Enumerated(EnumType.STRING)
  private LeaveStatus leavestatus;

  @Enumerated(EnumType.STRING)
  private ApproveStatus approvestatus;

  @ManyToOne private Employee employee;

  @Embedded private Pending pending;

    public Integer getHolidayid() {
        return holidayid;
    }

    public LeaveStatus getLeavestatus() {
        return leavestatus;
    }

    public void setLeavestatus(LeaveStatus leavestatus) {
        this.leavestatus = leavestatus;
    }

    public ApproveStatus getApprovestatus() {
        return approvestatus;
    }

    public void setApprovestatus(ApproveStatus approvestatus) {
        this.approvestatus = approvestatus;
    }

    public void setHolidayid(Integer holidayid) {
        this.holidayid = holidayid;
    }

    public LocalDate getDayleave() {
        return dayleave;
    }

    public void setDayleave(LocalDate dayleave) {
        this.dayleave = dayleave;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Pending getPending() {
        return pending;
    }

    public void setPending(Pending pending) {
        this.pending = pending;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Holiday holiday = (Holiday) o;
        return Objects.equals(holidayid, holiday.holidayid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(holidayid);
    }
}
