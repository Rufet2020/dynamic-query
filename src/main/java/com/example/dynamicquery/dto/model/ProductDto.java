package com.example.dynamicquery.dto.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProductDto(
        Long id,
        String name,
        String productCode,
        BigDecimal price,
        String description,
        LocalDate releaseDate,
        LocalDate expireDate
) {

}
