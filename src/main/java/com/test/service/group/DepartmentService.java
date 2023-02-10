package com.test.service.group;

import com.test.entity.domain.Department;
import com.test.entity.domain.Staff;

import java.util.List;

public interface DepartmentService {
    List<Department> findAll();
    List<Staff> findStaffByDepartmentsId(Long[] departmentsId);
}
