package com.bkn.bmea_backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data           // Generates getters/setters, toString, equals, hashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder        // For builder pattern if you want
@Document(collection = "projects")
public class Project {
    @Id
    private String id;

    private String name;
    private String sector;
    private Integer startYear;
    private Integer endYear;
    private String region;
    private String ownerDepartment;
    private BigDecimal budget;
    private String status;
    private LocalDateTime createdAt;
}
