package com.bkn.bmea_backend.service;

import com.bkn.bmea_backend.model.Activity;
import com.bkn.bmea_backend.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public List<Activity> getActivitiesByOutcome(String outcomeId) {
        return activityRepository.findByOutcomeId(outcomeId);
    }

    public Optional<Activity> getActivityById(String id) {
        return activityRepository.findById(id);
    }

    public Activity createActivity(Activity activity) {
        activity.setId(UUID.randomUUID().toString());
        activity.setCreatedAt(LocalDateTime.now());
        return activityRepository.save(activity);
    }

    public void deleteActivity(String id) {
        activityRepository.deleteById(id);
    }
}
