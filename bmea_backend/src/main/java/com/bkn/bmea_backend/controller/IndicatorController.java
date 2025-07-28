package com.bkn.bmea_backend.controller;

import com.bkn.bmea_backend.model.Indicator;
import com.bkn.bmea_backend.service.IndicatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/indicators")
@CrossOrigin(origins = "*")
public class IndicatorController {

    private final IndicatorService indicatorService;

    public IndicatorController(IndicatorService indicatorService) {
        this.indicatorService = indicatorService;
    }

    @GetMapping("/activity/{activityId}")
    public List<Indicator> getIndicatorsByActivity(@PathVariable String activityId) {
        return indicatorService.getIndicatorsByActivity(activityId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Indicator> getIndicatorById(@PathVariable String id) {
        return indicatorService.getIndicatorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Indicator> createIndicator(@RequestBody Indicator indicator) {
        return ResponseEntity.ok(indicatorService.createIndicator(indicator));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIndicator(@PathVariable String id) {
        indicatorService.deleteIndicator(id);
        return ResponseEntity.noContent().build();
    }
}
