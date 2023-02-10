package com.test.repository;

import com.test.entity.domain.Task;
import com.test.entity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findTasksByStaff_User(User user);

    int removeById(Long id);
}
