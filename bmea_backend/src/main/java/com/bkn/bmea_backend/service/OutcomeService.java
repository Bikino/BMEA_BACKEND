package com.bkn.bmea_backend.service;

import com.bkn.bmea_backend.model.Outcome;
import com.bkn.bmea_backend.repository.OutcomeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OutcomeService {

    private final OutcomeRepository outcomeRepository;

    public OutcomeService(OutcomeRepository outcomeRepository) {
        this.outcomeRepository = outcomeRepository;
    }

    public List<Outcome> getOutcomesByGoal(String goalId) {
        return outcomeRepository.findByGoalId(goalId);
    }

    public Optional<Outcome> getOutcomeById(String id) {
        return outcomeRepository.findById(id);
    }

    public Outcome createOutcome(Outcome outcome) {
        outcome.setId(UUID.randomUUID().toString());
        outcome.setCreatedAt(LocalDateTime.now());
        return outcomeRepository.save(outcome);
    }

    public void deleteOutcome(String id) {
        outcomeRepository.deleteById(id);
    }
}
