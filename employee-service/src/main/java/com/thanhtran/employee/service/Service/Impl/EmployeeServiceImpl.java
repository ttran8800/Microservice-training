package com.thanhtran.employee.service.Service.Impl;

import com.thanhtran.employee.service.Entity.Employee;
import com.thanhtran.employee.service.Payload.Department;
import com.thanhtran.employee.service.Payload.EmployeeWithDepartment;
import com.thanhtran.employee.service.Respository.EmployeeRepository;
import com.thanhtran.employee.service.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createNewEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public EmployeeWithDepartment getEmployeeWithDepartment(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/api/v1/departments/" + employee.getDepartmentId(), Department.class);
        EmployeeWithDepartment response = new EmployeeWithDepartment();
        response.setEmployee(employee);
        response.setDepartment(department);
        return response;
    }
}
