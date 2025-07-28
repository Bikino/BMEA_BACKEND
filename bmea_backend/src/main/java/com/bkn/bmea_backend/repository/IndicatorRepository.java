package com.bkn.bmea_backend.repository;

import com.bkn.bmea_backend.model.Activity;
import com.bkn.bmea_backend.model.Indicator;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IndicatorRepository extends MongoRepository<Indicator, String> {
    List<Indicator> findByActivityId(String activityId);
}
