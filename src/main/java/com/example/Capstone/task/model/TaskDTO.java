package com.example.Capstone.task.model;

import lombok.Data;

import java.util.UUID;

@Data
public class TaskDTO {
    private UUID id;
    private String status;
    private String name;
    private String description;
    private Integer timeSpent;
    private Integer timeIntended;
    private Long startedWork; // Unix timestamp in seconds
    private Long ceasedWork; // Unix timestamp in seconds
    private UUID parentTask;
    private String childTask;
    private String category;
    private Long scheduledStart; // Unix timestamp in seconds
    private Long scheduledEnd; // Unix timestamp in seconds
    private Integer numBreaks;
    private Integer longestWorkStretch;
    private UUID timeLog; // Not positive this is the right variable for this, you may need to check me
    private Boolean inFocusList;
    private Boolean selected;
    private String intentList;
    private String customParam;

    public TaskDTO(Task task) {
        this.id = task.getId();
        this.status = task.getStatus();
        this.name = task.getName();
        this.description = task.getDescription();
        this.timeSpent = task.getTimeSpent();
        this.timeIntended = task.getTimeIntended();
        this.startedWork = task.getStartedWork();
        this.ceasedWork = task.getCeasedWork();
        this.parentTask = task.getParentTask();
        this.childTask = task.getChildTask();
        this.category = task.getCategory();
        this.scheduledStart = task.getScheduledStart();
        this.scheduledEnd = task.getScheduledEnd();
        this.numBreaks = task.getNumBreaks();
        this.longestWorkStretch = task.getLongestWorkStretch();
        this.timeLog = task.getTimeLog();
        this.inFocusList = task.getInFocusList();
        this.selected = task.getSelected();
        this.intentList = task.getIntentList();
        this.customParam = task.getCustomParam();

    }
}
