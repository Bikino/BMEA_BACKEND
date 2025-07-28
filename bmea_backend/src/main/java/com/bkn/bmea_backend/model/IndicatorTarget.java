package com.bkn.bmea_backend.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "indicator_targets")
public class IndicatorTarget {
    @Id
    private String id;
    private String indicatorId;     // Reference to Indicator
    private Integer year;
    private Integer quarter;        // nullable if annual target
    private BigDecimal targetValue;
}