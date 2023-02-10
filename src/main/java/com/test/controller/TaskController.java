package com.test.controller;

import com.test.entity.dto.TaskDto;
import com.test.mapper.TaskMapper;
import com.test.service.task.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private TaskMapper taskMapper;

    @PostMapping("/add/{username}")
    @ResponseStatus(HttpStatus.OK)
    public void add(@RequestBody TaskDto taskDto, @PathVariable("username") String username) {
        taskService.add(taskMapper.toModal(taskDto), username);
    }

    @PostMapping("/edit")
    @ResponseStatus(HttpStatus.OK)
    public void edit(@RequestBody TaskDto taskDto) {
        taskService.edit(taskMapper.toModal(taskDto));
    }

    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public List<TaskDto> findAll() {
        return taskMapper.toDtoList(taskService.findAll());
    }

    @GetMapping("/findAll/{username}")
    @ResponseStatus(HttpStatus.OK)
    public List<TaskDto> findAllByUsername(@PathVariable("username") String username) {
        return taskMapper.toDtoList(taskService.findByUsername(username));
    }

    @DeleteMapping("/remove")
    @ResponseStatus(HttpStatus.OK)
    public void removeTask(@RequestParam Long taskId) {
        taskService.remove(taskId);
    }
}
