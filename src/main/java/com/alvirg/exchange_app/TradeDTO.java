package com.alvirg.exchange_app;

import lombok.Data;

@Data
public class TradeDTO {
    private Integer id;
    private int offerorQuantity;
    private int offereeQuantity;
    private TradeStatus status;
    private Integer offerorListingId;
    private Integer offereeListingId;
}

