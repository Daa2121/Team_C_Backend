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

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
