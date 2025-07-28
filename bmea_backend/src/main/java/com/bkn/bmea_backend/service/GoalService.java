package com.bkn.bmea_backend.service;

import com.bkn.bmea_backend.model.Activity;
import com.bkn.bmea_backend.model.Goal;
import com.bkn.bmea_backend.repository.ActivityRepository;
import com.bkn.bmea_backend.repository.GoalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GoalService {

    private final GoalRepository goalRepository;

    public GoalService(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    public List<Goal> getGoalsByProject(String projectId) {
        return goalRepository.findByProjectId(projectId);
    }

    public Optional<Goal> getGoalById(String id) {
        return goalRepository.findById(id);
    }

    public Goal createGoal(Goal goal) {
        goal.setId(UUID.randomUUID().toString());
        goal.setCreatedAt(LocalDateTime.now());
        return goalRepository.save(goal);
    }

    public void deleteGoal(String id) {
        goalRepository.deleteById(id);
    }
}
