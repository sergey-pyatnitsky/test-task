package com.test.repository;

import com.test.entity.domain.Department;
import com.test.entity.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    Optional<Staff> findStaffByUser_Username(String username);
    List<Staff> findStaffByDepartmentIn(List<Department> departmentList);
}
