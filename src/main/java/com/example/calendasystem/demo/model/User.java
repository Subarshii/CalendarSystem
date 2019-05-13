package com.example.calendasystem.demo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name = "USER_CALENDAR")
public class User implements Serializable {
  @GeneratedValue(generator = "user_uuid", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "user_uuid", allocationSize = 1, sequenceName = "USER_UUID")
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

  @OneToMany
  @JoinColumn(name = "holidayid", insertable = false, updatable = false)
  private Holidays holidays;

  public Holidays getHolidays() {
    return holidays;
  }

  @OneToOne
  @JoinColumn(name = "departmentid", insertable = false, updatable = false)
  private Department department;

  public Department getDepartment() {
    return department;
  }

  @OneToMany
  @JoinColumn(name = "pendingid", insertable = false, updatable = false)
  private HolidayPending holidayPending;

  public HolidayPending getHolidayPending() {
    return holidayPending;
  }

  public void setHolidayPending(HolidayPending holidayPending) {
    this.holidayPending = holidayPending;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public void setHolidays(Holidays holidays) {
    this.holidays = holidays;
  }

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

  @Override
  public String toString() {
    return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
        .add("departmentid = " + departmentid)
        .add("description = " + description)
        .add("email = " + email)
        .add("firstname = " + firstname)
        .add("holidayid = " + holidayid)
        .add("lastname = " + lastname)
        .add("password = " + password)
        .add("phone = " + phone)
        .add("userid = " + userid)
        .add("username = " + username)
        .add("workstart = " + workstart)
        .toString();
  }
}
