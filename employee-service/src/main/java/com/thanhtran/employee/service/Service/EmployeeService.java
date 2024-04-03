package com.thanhtran.employee.service.Service;

import com.thanhtran.employee.service.Entity.Employee;
import com.thanhtran.employee.service.Payload.EmployeeWithDepartment;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee createNewEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    EmployeeWithDepartment getEmployeeWithDepartment(Long id);
}
