package com.test.service.task;

import com.test.entity.domain.Staff;
import com.test.entity.domain.Task;
import com.test.entity.domain.User;
import com.test.exception.NoSuchDataException;
import com.test.repository.StaffRepository;
import com.test.repository.TaskRepository;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public List<Task> findByUsername(String username) {
        User user = userRepository.findById(username)
                .orElseThrow(() -> new NoSuchDataException("User not found"));

        return taskRepository.findTasksByStaff_User(user);
    }

    @Override
    public Task add(Task task, String username) {
        Staff staff = staffRepository.findStaffByUser_Username(username)
                .orElseThrow(() -> new NoSuchDataException("User not found"));
        task.setStaff(staff);
        return taskRepository.save(task);
    }

    @Override
    public Task edit(Task task) {
        Task taskFromDb = taskRepository.findById(task.getId())
                .orElseThrow(() -> new NoSuchDataException("Task not found"));
        taskFromDb.setName(task.getName());
        taskFromDb.setDescription(task.getDescription());
        return taskRepository.save(taskFromDb);
    }

    @Override
    public boolean remove(Long taskId) {
        Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new NoSuchDataException("Task not found"));

        return taskRepository.removeById(task.getId()) == 1;
    }
}
