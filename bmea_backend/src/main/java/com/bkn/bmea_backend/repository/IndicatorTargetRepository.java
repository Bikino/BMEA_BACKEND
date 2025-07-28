package com.bkn.bmea_backend.repository;

import com.bkn.bmea_backend.model.Activity;
import com.bkn.bmea_backend.model.IndicatorTarget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IndicatorTargetRepository extends MongoRepository<IndicatorTarget, String> {
}
