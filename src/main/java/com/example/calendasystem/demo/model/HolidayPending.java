package com.example.calendasystem.demo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "HOLIDAY_PENDING")
// วันหยุดราชการ
public class HolidayPending {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pending_id")
//  @SequenceGenerator(name = "pending_id", allocationSize = 1, sequenceName = "PENDING_ID")
  private Integer pendingid;

  private LocalDate datecreate;
  private LocalDate leavefrom;
  private LocalDate leaveto;

  @Enumerated(EnumType.STRING)
  private LeaveType leavetype;

  @Enumerated(EnumType.STRING)
  private StatusType statustype;
//
//  @ManyToMany(mappedBy = "userpending")
//  private Set<User> users;
//
//  public Set<User> getUsers() {
//    return users;
//  }
//
//  public void setUsers(Set<User> users) {
//    this.users = users;
//  }

  public HolidayPending() {}

  public Integer getPendingid() {
    return pendingid;
  }

  public void setPendingid(Integer pendingid) {
    this.pendingid = pendingid;
  }

  public LocalDate getDatecreate() {
    return datecreate;
  }

  public void setDatecreate(LocalDate datecreate) {
    this.datecreate = datecreate;
  }

  public LocalDate getLeavefrom() {
    return leavefrom;
  }

  public void setLeavefrom(LocalDate leavefrom) {
    this.leavefrom = leavefrom;
  }

  public LocalDate getLeaveto() {
    return leaveto;
  }

  public void setLeaveto(LocalDate leaveto) {
    this.leaveto = leaveto;
  }

  public StatusType getStatustype() {
    return statustype;
  }

  public void setStatustype(StatusType statustype) {
    this.statustype = statustype;
  }

  public LeaveType getLeavetype() {
    return leavetype;
  }

  public void setLeavetype(LeaveType leavetype) {
    this.leavetype = leavetype;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HolidayPending that = (HolidayPending) o;
    return Objects.equals(pendingid, that.pendingid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendingid);
  }


}
