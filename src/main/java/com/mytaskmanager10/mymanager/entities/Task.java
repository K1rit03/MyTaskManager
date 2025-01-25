package com.mytaskmanager10.mymanager.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String priority;

    @Column(name = "target_date", nullable = false)
    private Instant targetdate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public void updateStatus(String status) {
        this.status = status;
    }

    public void updatePriority(String priority) {
        this.priority = priority;
    }



}
