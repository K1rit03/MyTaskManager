package com.mytaskmanager10.mymanager.repositories;

import com.mytaskmanager10.mymanager.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
    Optional<Task> findById(UUID id);
}
