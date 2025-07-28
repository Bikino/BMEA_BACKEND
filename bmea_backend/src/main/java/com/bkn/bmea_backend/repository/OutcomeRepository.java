package com.bkn.bmea_backend.repository;

import com.bkn.bmea_backend.model.IndicatorTarget;
import com.bkn.bmea_backend.model.Outcome;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OutcomeRepository extends MongoRepository<Outcome, String> {
    List<Outcome> findByGoalId(String goalId);
}
