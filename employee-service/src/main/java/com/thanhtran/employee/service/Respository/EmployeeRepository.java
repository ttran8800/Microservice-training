package com.thanhtran.employee.service.Respository;

import com.thanhtran.employee.service.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
