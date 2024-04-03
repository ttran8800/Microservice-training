package com.thanhtran.employee.service.Payload;

import com.thanhtran.employee.service.Entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeWithDepartment {
    private Employee employee;
    private Department department;
}
