package com.bkn.bmea_backend.service;

import com.bkn.bmea_backend.model.Goal;
import com.bkn.bmea_backend.model.Indicator;
import com.bkn.bmea_backend.repository.GoalRepository;
import com.bkn.bmea_backend.repository.IndicatorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class IndicatorService {

    private final IndicatorRepository indicatorRepository;

    public IndicatorService(IndicatorRepository indicatorRepository) {
        this.indicatorRepository = indicatorRepository;
    }

    public List<Indicator> getIndicatorsByActivity(String activityId) {
        return indicatorRepository.findByActivityId(activityId);
    }

    public Optional<Indicator> getIndicatorById(String id) {
        return indicatorRepository.findById(id);
    }

    public Indicator createIndicator(Indicator indicator) {
        indicator.setId(UUID.randomUUID().toString());
        indicator.setCreatedAt(LocalDateTime.now());
        return indicatorRepository.save(indicator);
    }

    public void deleteIndicator(String id) {
        indicatorRepository.deleteById(id);
    }
}
