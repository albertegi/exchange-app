package com.alvirg.exchange_app;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@RequiredArgsConstructor
@SuperBuilder
@Entity
public class InterestEntity extends BaseEntity{
    private int offerorQuantity;
    private int offereeQuantity;
    private String offereeStatus;
    private int offerorListingId;
    private int offereeListingId;
}
