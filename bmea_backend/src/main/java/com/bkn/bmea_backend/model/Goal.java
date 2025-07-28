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
@Document(collection = "goals")
public class Goal {
    @Id
    private String id;
    private String projectId;       // Reference to Project
    private String description;
    private LocalDateTime createdAt;
}
