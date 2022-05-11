package com.mefa.employee.repository;

import com.mefa.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployDao extends JpaRepository<Employee, Integer> {
}
