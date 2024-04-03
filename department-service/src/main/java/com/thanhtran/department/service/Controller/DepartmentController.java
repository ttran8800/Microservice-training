package com.thanhtran.department.service.Controller;

import com.thanhtran.department.service.Entity.Department;
import com.thanhtran.department.service.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {
        var data = departmentService.getAllDepartments();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long id) {
        var data = departmentService.getDepartmentById(id);
        return ResponseEntity.ok(data);
    }

    @PostMapping
    public ResponseEntity<Department> createNewDepartment(@RequestBody Department department) {
        var data = departmentService.createNewDepartment(department);
        return ResponseEntity.ok(data);
    }
}
