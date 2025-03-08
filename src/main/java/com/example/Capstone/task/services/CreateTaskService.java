package com.example.Capstone.task.services;

import com.example.Capstone.Command;
import com.example.Capstone.task.model.Task;
import com.example.Capstone.task.model.TaskDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskService implements Command<Task, TaskDTO> {

    private final TaskRepository taskRepository;

    public CreateTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public ResponseEntity<TaskDTO> execute(Task task) {
        Task savedTask = taskRepository.save(task);

        return ResponseEntity.status(HttpStatus.CREATED).body(new TaskDTO(savedTask));
    }
}
