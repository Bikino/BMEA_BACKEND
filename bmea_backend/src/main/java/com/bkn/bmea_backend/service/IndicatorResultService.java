package com.bkn.bmea_backend.service;

import com.bkn.bmea_backend.model.Indicator;
import com.bkn.bmea_backend.model.IndicatorResult;
import com.bkn.bmea_backend.repository.IndicatorRepository;
import com.bkn.bmea_backend.repository.IndicatorResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class IndicatorResultService {

    private final IndicatorResultRepository indicatorResultRepository;

    public IndicatorResultService(IndicatorResultRepository indicatorResultRepository) {
        this.indicatorResultRepository = indicatorResultRepository;
    }

    public List<IndicatorResult> getAllProjects() {
        return indicatorResultRepository.findAll();
    }

    public Optional<IndicatorResult> getProjectById(String id) {
        return indicatorResultRepository.findById(id);
    }

    public IndicatorResult createProject(IndicatorResult indicatorResult) {
        indicatorResult.setId(UUID.randomUUID().toString());
        return indicatorResultRepository.save(indicatorResult);
    }

    public void deleteProject(String id) {
        indicatorResultRepository.deleteById(id);
    }
}
