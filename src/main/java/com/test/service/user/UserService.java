package com.test.service.user;

import com.test.entity.domain.Authority;
import com.test.entity.domain.User;

import java.util.Optional;
import java.util.Set;

public interface UserService {
    Set<Authority> getAuthoritiesByUsername(String username);

    Optional<User> find(String username);

}
