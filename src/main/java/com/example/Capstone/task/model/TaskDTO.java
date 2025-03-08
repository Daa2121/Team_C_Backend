package com.example.Capstone.task.model;

import lombok.Data;

import java.util.UUID;

@Data
public class TaskDTO {
    private UUID id;
    private String name;
    private String description;

    public TaskDTO(Task task) {
        this.description = task.getDescription();
        this.name = task.getName();
        this.id = task.getId();
    }
}
