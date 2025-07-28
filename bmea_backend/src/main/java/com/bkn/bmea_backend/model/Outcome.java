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
@Document(collection = "outcomes")
public class Outcome {
    @Id
    private String id;
    private String goalId;          // Reference to Goal
    private String description;
    private LocalDateTime createdAt;
}
