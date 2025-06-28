package com.alvirg.exchange_app.repositories;

import com.alvirg.exchange_app.ListingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ListingRepository extends JpaRepository<ListingEntity, Integer> {
    List<ListingEntity> findByOwnerId(Integer id);
    List<ListingEntity> findByCategoryId(Integer id);


}
