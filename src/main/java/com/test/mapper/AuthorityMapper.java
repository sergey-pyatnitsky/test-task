package com.test.mapper;

import com.test.entity.domain.Authority;
import com.test.entity.dto.AuthorityDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.Set;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorityMapper {

    AuthorityDto toDto(Authority authority);

    Authority toModal(AuthorityDto AuthorityDto);

    Set<AuthorityDto> toDtoList(Set<Authority> authorities);

    Set<Authority> toModalList(Set<AuthorityDto> AuthorityDtoSet);
}
