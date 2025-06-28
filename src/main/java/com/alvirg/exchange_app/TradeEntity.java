package com.alvirg.exchange_app;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class TradeEntity extends BaseEntity {

    private int offerorQuantity;
    private int offereeQuantity;

    @Enumerated(EnumType.STRING)
    private TradeStatus status;

    @ManyToOne
    @JoinColumn(name = "offeror_listing_id")
    private ListingEntity offerorListing;

    @ManyToOne
    @JoinColumn(name = "offeree_listing_id")
    private ListingEntity offereeListing;
}
