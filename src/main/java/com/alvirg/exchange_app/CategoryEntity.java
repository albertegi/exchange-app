package com.alvirg.exchange_app;

import jakarta.persistence.Entity;
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
public class CategoryEntity extends BaseEntity {
    private String name;
    private String description;


//        @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//        private List<ListingEntity> listings;
//    }
}
