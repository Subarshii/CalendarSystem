package com.example.calendasystem.demo.model.NEW;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENTS_EMPLOYEE")
public class Department implements Serializable {

  @GeneratedValue(generator = "DepartmentIdGenerator", strategy = GenerationType.AUTO)
  @Id
  private Integer departmentid;
  private String department;

  @OneToMany private Set<Employee> employee;

  public Set<Employee> getEmployee() {
    return employee;
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

  public void setEmployee(Set<Employee> employee) {
    this.employee = employee;
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
