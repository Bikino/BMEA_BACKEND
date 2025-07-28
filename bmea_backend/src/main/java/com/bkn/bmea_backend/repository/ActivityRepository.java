package com.bkn.bmea_backend.repository;

import com.bkn.bmea_backend.model.Activity;
import com.bkn.bmea_backend.model.Goal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ActivityRepository extends MongoRepository<Activity, String> {
    List<Activity> findByOutcomeId(String outcomeId);
}
