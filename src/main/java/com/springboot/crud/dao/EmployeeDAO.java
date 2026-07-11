package com.springboot.crud.dao;

import com.springboot.crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
