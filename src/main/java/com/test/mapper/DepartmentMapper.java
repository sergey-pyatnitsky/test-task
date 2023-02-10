package com.test.mapper;

import com.test.entity.domain.Department;
import com.test.entity.dto.DepartmentDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    DepartmentDto toDto(Department department);

    Department toModal(DepartmentDto departmentDto);

    List<DepartmentDto> toDtoList(List<Department> departmentList);

    List<Department> toModalList(List<DepartmentDto> departmentDtoList);
}
