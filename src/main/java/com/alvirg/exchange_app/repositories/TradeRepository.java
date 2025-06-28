package com.alvirg.exchange_app.repositories;

import com.alvirg.exchange_app.TradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TradeRepository extends JpaRepository<TradeEntity, Integer> {
    List<TradeEntity> findByOfferorListingIdOrOffereeListingId(Integer offerorId, Integer offereeId);
}
