package org.generation.jaita138.demo4.db.service;

import java.util.List;

import org.generation.jaita138.demo4.db.entity.Employee;
import org.generation.jaita138.demo4.db.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public void insertEmployee(Employee employee) {

        employeeRepo.save(employee);
    }

    public List<Employee> findAll() {

        return employeeRepo.findAll();
    }
}
