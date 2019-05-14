package com.example.calendasystem.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "USER_CALENDAR")
public class User implements Serializable {
  @GeneratedValue(generator = "UserIdGenerator", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "UserIdGenerator", allocationSize = 1, sequenceName = "USER_UUID")
  @Id
  private Integer userid;
  private String firstname;
  private String lastname;
  private String username;
  private String password;
  private Integer departmentid;
  private String email;
  private Long phone;
  private Integer holidayid;
  private LocalDate workstart;
  private String description;


  public User() {}

  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getDepartmentid() {
    return departmentid;
  }

  public void setDepartmentid(Integer departmentid) {
    this.departmentid = departmentid;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public Integer getHolidayid() {
    return holidayid;
  }

  public void setHolidayid(Integer holidayid) {
    this.holidayid = holidayid;
  }

  public LocalDate getWorkstart() {
    return workstart;
  }

  public void setWorkstart(LocalDate workstart) {
    this.workstart = workstart;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
//
//  @ManyToMany
//  @JoinTable(
//      name = "user_holiday_pending",
//      joinColumns = @JoinColumn(name = "userid"),
//      inverseJoinColumns = @JoinColumn(name = "pendingid"))
//  private Set<HolidayPending> userpending;
//
//  @OneToMany(mappedBy = "user")
//  private Set<Holidays> holidays;

  @ManyToOne
  private Department department;


  //  public Set<HolidayPending> getUserpending() {
//    return userpending;
//  }
//
//
//  public void setUserpending(Set<HolidayPending> userpending) {
//    this.userpending = userpending;
//  }
//

//
//  public Set<Holidays> getHolidays() {
//    return holidays;
//  }
//
//  public void setHolidays(Set<Holidays> holidays) {
//    this.holidays = holidays;
//  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(userid, user.userid) && Objects.equals(username, user.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, username);
  }


}
