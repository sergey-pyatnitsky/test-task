package com.test.service.group;

import com.test.entity.domain.Department;
import com.test.entity.domain.Staff;
import com.test.repository.DepartmentRepository;
import com.test.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public List<Staff> findStaffByDepartmentsId(Long[] departmentsId) {
        return staffRepository.findStaffByDepartmentIn(departmentRepository.findAllById(Arrays.asList(departmentsId)));
    }
}
