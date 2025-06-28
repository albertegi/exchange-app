package com.alvirg.exchange_app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListingResponseDTO {
    private Integer id;
    private String name;
    private String description;
    private String condition;
    private int quantity;
    private String imageUrl;
    private boolean visible;
    private int userId;
    private int categoryId;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
}

