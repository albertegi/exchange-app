package com.alvirg.exchange_app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListingShortDTO {
    private Integer id;
    private String name;
    private String imageUrl;
}
