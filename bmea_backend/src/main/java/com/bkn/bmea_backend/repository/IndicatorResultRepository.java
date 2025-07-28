package com.bkn.bmea_backend.repository;

import com.bkn.bmea_backend.model.Activity;
import com.bkn.bmea_backend.model.IndicatorResult;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IndicatorResultRepository extends MongoRepository<IndicatorResult, String> {
}
