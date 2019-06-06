package com.example.calendasystem.demo.model.NEW;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {
  @GeneratedValue(generator = "EmployeeGenerator", strategy = GenerationType.AUTO)
  @Id
  private Integer employeeid;

  private String firstname;
  private String lastname;
  private String nickname;
  private String email;
  private long phone;
  private String address;
  private Integer age;
  private LocalDate birthday;
  private LocalDate worktimestart;

  @ManyToOne
  @JoinColumn(name = "departmentid")
  private Department department;

  @OneToMany private Set<Holiday> holidays;

  public Set<Holiday> getHolidays() {
    return holidays;
  }

  public void setHolidays(Set<Holiday> holidays) {
    this.holidays = holidays;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Integer getEmployeeid() {
    return employeeid;
  }

  public void setEmployeeid(Integer employeeid) {
    this.employeeid = employeeid;
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

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getPhone() {
    return phone;
  }

  public void setPhone(long phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public LocalDate getWorktimestart() {
    return worktimestart;
  }

  public void setWorktimestart(LocalDate worktimestart) {
    this.worktimestart = worktimestart;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return Objects.equals(employeeid, employee.employeeid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeid);
  }
}
