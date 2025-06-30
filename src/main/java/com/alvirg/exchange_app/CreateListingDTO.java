package com.alvirg.exchange_app;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateListingDTO {
    private String name;
    private String description;
    private String condition;
    private int quantity;
    private String imageUrl;
    private boolean visible;
    private int userId;
    private int categoryId;

}
