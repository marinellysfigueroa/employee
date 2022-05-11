package com.mefa.employee.service;

import com.mefa.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
  List<Employee> findAllEmployees();
}
