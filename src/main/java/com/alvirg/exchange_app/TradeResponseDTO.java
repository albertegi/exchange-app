package com.alvirg.exchange_app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TradeResponseDTO {
    private Integer id;

    private int offerorQuantity;
    private int offereeQuantity;

    private TradeStatus status;

    private ListingShortDTO offerorListing;
    private ListingShortDTO offereeListing;
}
