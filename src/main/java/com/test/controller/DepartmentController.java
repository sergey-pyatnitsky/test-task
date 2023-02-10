package com.test.controller;

import com.test.entity.dto.DepartmentDto;
import com.test.entity.dto.StaffDto;
import com.test.entity.pojo.FindStaffByDepartmentsRequest;
import com.test.mapper.DepartmentMapper;
import com.test.mapper.StaffMapper;
import com.test.service.group.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private StaffMapper staffMapper;

    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public List<DepartmentDto> findAll() {
        return departmentMapper.toDtoList(departmentService.findAll());
    }

    @PostMapping("/findStaffByDepartments")
    @ResponseStatus(HttpStatus.OK)
    public List<StaffDto> findStaffByDepartments(@RequestBody FindStaffByDepartmentsRequest request) {
        return staffMapper.toDtoList(departmentService.findStaffByDepartmentsId(request.getDepartments_id()));
    }
}
