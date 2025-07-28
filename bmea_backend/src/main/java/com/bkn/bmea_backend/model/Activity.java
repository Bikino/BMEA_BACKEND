package com.bkn.bmea_backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "activities")
public class Activity {
    @Id
    private String id;
    private String outcomeId;       // Reference to Outcome
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String responsibleUnit;
    private String status;
    private LocalDateTime createdAt;
}
