package com.dariuscruceru.employeemanager.Repository;

import com.dariuscruceru.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeRepository extends JpaRepository<Employee,Long> {

    //querry method
    void deleteEmployeeById(Long id);

    //querry method
    Optional<Employee> findEmployeeById(Long id);

}
