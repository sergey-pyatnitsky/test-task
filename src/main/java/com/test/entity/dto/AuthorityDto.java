package com.test.entity.dto;

import com.test.entity.enums.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthorityDto {
    private Role role;
}