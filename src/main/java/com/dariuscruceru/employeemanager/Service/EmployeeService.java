package com.dariuscruceru.employeemanager.Service;

import com.dariuscruceru.employeemanager.Repository.EmployeRepository;
import com.dariuscruceru.employeemanager.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeRepository employeRepository;

    @Autowired
    public EmployeeService(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeRepository.save(employee);
    }


}
