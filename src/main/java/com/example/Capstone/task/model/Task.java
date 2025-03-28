package com.example.Capstone.task.model;

import com.example.Capstone.uuidGeneratorV7.GeneratedUuidV7;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Data
public class Task {
    @Id
    @GeneratedUuidV7
    private UUID id;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "time_spent")
    private Integer timeSpent;

    @Column(name = "time_intended")
    private Integer timeIntended;

    @Column(name = "started_work")
    private Long startedWork; // Unix timestamp in seconds

    @Column(name = "ceased_work")
    private Long ceasedWork; // Unix timestamp in seconds

    @Column(name = "parent_task")
    private UUID parentTask;

    @Column(name = "child_task")
    private String childTask;

    @Column(name = "category")
    private String category;

    @Column(name = "scheduled_start")
    private Long scheduledStart; // Unix timestamp in seconds

    @Column(name = "scheduled_end")
    private Long scheduledEnd; // Unix timestamp in seconds

    @Column(name = "num_breaks")
    private Integer numBreaks;

    @Column(name = "longest_work_stretch")
    private Integer longestWorkStretch; // Assuming this is in seconds

    @Column(name = "time_log")
    private UUID timeLog;

    @Column(name = "in_focus_list")
    private Boolean inFocusList;

    @Column(name = "selected")
    private Boolean selected;

    @Column(name = "intent_list")
    private String intentList;

    @Column(name = "custom_param")
    private String customParam;


}
