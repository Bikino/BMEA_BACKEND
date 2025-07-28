package com.bkn.bmea_backend.repository;

import com.bkn.bmea_backend.model.Goal;
import com.bkn.bmea_backend.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GoalRepository extends MongoRepository<Goal, String> {
    List<Goal> findByProjectId(String projectId);
}
