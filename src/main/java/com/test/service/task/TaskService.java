package com.test.service.task;

import com.test.entity.domain.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();
    List<Task> findByUsername(String username);

    Task add(Task task, String username);
    Task edit(Task task);
    boolean remove(Long taskId);
}
