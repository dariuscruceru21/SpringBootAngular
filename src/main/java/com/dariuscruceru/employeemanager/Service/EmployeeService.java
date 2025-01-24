package com.dariuscruceru.employeemanager.Service;

import com.dariuscruceru.employeemanager.Exception.UserNotFoundException;
import com.dariuscruceru.employeemanager.Repository.EmployeRepository;
import com.dariuscruceru.employeemanager.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Employee> findAllEmployees() {
        return employeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return employeRepository.findEmployeeById(id).orElseThrow(()->new UserNotFoundException("User by id " + id + "was not found"));
    }

    public void deleteEmployee(Long id) {
        employeRepository.deleteEmployeeById(id);
    }


}
