package com.example.calendasystem.demo.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENT_CALENDAR")
public class Department {
  @Id
  @GeneratedValue(generator = "DepartmentIdGenerator", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "DepartmentIdGenerator", allocationSize = 1, sequenceName = "DEPARTMENTS_SEQ")
  private Integer departmentid;

  private String department;
  private String description;

  @OneToMany(mappedBy = "department")
  private Set<User> user;

  public Department() {}

  public Set<User> getUser() {
    return user;
  }

  public void setUser(Set<User> user) {
    this.user = user;
  }

  public Integer getDepartmentid() {
    return departmentid;
  }

  public void setDepartmentid(Integer departmentid) {
    this.departmentid = departmentid;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
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
    Department that = (Department) o;
    return Objects.equals(departmentid, that.departmentid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentid);
  }
}
