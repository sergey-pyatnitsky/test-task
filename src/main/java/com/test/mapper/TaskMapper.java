package com.test.mapper;

import com.test.entity.domain.Task;
import com.test.entity.dto.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = StaffMapper.class)
public interface TaskMapper {
    TaskDto toDto(Task task);

    Task toModal(TaskDto taskDto);

    List<TaskDto> toDtoList(List<Task> taskList);

    List<Task> toModalList(List<TaskDto> taskDtoList);
}
