package com.example.calendasystem.demo.model.NEW.Embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class Pending {
  private Integer ordination;
  private Integer holiday;
  private Integer sick;

  public Integer getOrdination() {
    return ordination;
  }

  public void setOrdination(Integer ordination) {
    this.ordination = ordination;
  }

  public Integer getHoliday() {
    return holiday;
  }

  public void setHoliday(Integer holiday) {
    this.holiday = holiday;
  }

  public Integer getSick() {
    return sick;
  }

  public void setSick(Integer sick) {
    this.sick = sick;
  }

  public Pending(Integer ordination, Integer holiday, Integer sick) {
    this.ordination = ordination;
    this.holiday = holiday;
    this.sick = sick;
  }

  public Pending() {
  }
}
