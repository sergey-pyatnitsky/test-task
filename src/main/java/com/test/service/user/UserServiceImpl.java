package com.test.service.user;

import com.test.entity.domain.Authority;
import com.test.entity.domain.User;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Set<Authority> getAuthoritiesByUsername(String username) {
        User user = userRepository.findById(username).orElse(null);
        if (user != null && user.getRoles() != null)
            return user.getRoles();
        return null;
    }

    @Override
    public Optional<User> find(String username) {
        return userRepository.findById(username);
    }
}
