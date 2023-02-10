package com.test.entity.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StaffDto {
    private Long id;
    private String name;
    private UserDto user;
    private int age;
    private DepartmentDto group;
}
