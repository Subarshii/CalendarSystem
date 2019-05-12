package com.example.calendasystem.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DEPARTMENT_CALENDAR")
public class Department {
  @GeneratedValue(generator = "department_id", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "department_id", allocationSize = 1, sequenceName = "DEPARTMENT_ID")
  @Id
  private Integer departmentid;
  private String department;
  private String description;

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

  @Override
  public String toString() {
    return "Department{"
        + "departmentid="
        + departmentid
        + ", department='"
        + department
        + '\''
        + ", description='"
        + description
        + '\''
        + '}';
  }
}
