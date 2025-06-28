package com.alvirg.exchange_app;

import lombok.Data;

@Data
public class ListingDTO {
    private Integer id;
    private String name;
    private String description;
    private String condition;
    private int quantity;
    private String imageUrl;
    private boolean visible;
    private Integer userId;
    private Integer categoryId;
}

