package com.mefa.employee.service;

import com.mefa.employee.model.Employee;
import com.mefa.employee.repository.EmployDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployDao employDao;

    @Override
    public List<Employee> findAllEmployees() {
        return employDao.findAll();
    }
}
