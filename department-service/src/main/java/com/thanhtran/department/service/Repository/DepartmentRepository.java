package com.thanhtran.department.service.Repository;

import com.thanhtran.department.service.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
