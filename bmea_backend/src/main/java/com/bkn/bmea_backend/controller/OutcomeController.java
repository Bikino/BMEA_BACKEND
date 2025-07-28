package com.bkn.bmea_backend.controller;

import com.bkn.bmea_backend.model.Outcome;
import com.bkn.bmea_backend.service.OutcomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/outcomes")
@CrossOrigin(origins = "*")
public class OutcomeController {

    private final OutcomeService outcomeService;

    public OutcomeController(OutcomeService outcomeService) {
        this.outcomeService = outcomeService;
    }

    @GetMapping("/goal/{goalId}")
    public List<Outcome> getOutcomesByGoal(@PathVariable String goalId) {
        return outcomeService.getOutcomesByGoal(goalId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Outcome> getOutcomeById(@PathVariable String id) {
        return outcomeService.getOutcomeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Outcome> createOutcome(@RequestBody Outcome outcome) {
        return ResponseEntity.ok(outcomeService.createOutcome(outcome));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOutcome(@PathVariable String id) {
        outcomeService.deleteOutcome(id);
        return ResponseEntity.noContent().build();
    }
}