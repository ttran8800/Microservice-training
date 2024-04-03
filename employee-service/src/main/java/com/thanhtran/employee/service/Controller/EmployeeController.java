package com.thanhtran.employee.service.Controller;

import com.thanhtran.employee.service.Entity.Employee;
import com.thanhtran.employee.service.Payload.EmployeeWithDepartment;
import com.thanhtran.employee.service.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        var data = employeeService.getAllEmployees();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
        var data = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(data);
    }

    @PostMapping
    public ResponseEntity<Employee> createNewEmployee(@RequestBody Employee employee) {
        var data = employeeService.createNewEmployee(employee);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}/departments")
    public ResponseEntity<EmployeeWithDepartment> getEmployeeWithDepartment(@PathVariable("id") Long id) {
        var data = employeeService.getEmployeeWithDepartment(id);
        if (data == null)
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(data);
    }
}
