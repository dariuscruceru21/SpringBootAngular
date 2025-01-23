package com.dariuscruceru.employeemanager.Repository;

import com.dariuscruceru.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employee,Long> {


}
