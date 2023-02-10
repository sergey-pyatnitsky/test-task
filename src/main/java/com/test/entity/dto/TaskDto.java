package com.test.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskDto {
    private Long id;
    private String name;
    private String description;
    private StaffDto staff;
    private Date create_date;
    private Time workingTime;
}
