package com.thanhtran.department.service.Service;

import com.thanhtran.department.service.Entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();

    Department createNewDepartment(Department department);

    Department getDepartmentById(Long id);
}
