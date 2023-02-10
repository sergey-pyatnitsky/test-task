package com.test.mapper;

import com.test.entity.domain.Staff;
import com.test.entity.dto.StaffDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DepartmentMapper.class, UserMapper.class})
public interface StaffMapper {
    StaffDto toDto(Staff staff);

    Staff toModal(StaffDto staffDto);

    List<StaffDto> toDtoList(List<Staff> staffList);

    List<Staff> toModalList(List<StaffDto> staffDtoList);
}
