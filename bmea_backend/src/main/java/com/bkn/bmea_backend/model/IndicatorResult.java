package com.bkn.bmea_backend.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "indicator_results")
public class IndicatorResult {
    @Id
    private String id;
    private String indicatorId;     // Reference to Indicator
    private Integer year;
    private Integer quarter;        // nullable if annual result
    private BigDecimal achievedValue;
    private String comments;
    private String evidenceUrl;     // Link to uploaded proof documents
    private LocalDateTime submittedAt;
}