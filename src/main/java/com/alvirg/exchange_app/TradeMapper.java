package com.alvirg.exchange_app;

import org.springframework.stereotype.Service;

@Service
public class TradeMapper {

    public static TradeResponseDTO toTradeResponseDTO(
            TradeEntity tradeEntity,
            ListingEntity offerorListing,
            ListingEntity offereeListing ){

        if(tradeEntity == null) return null;


        var tradeResponseDto = new TradeResponseDTO();
        tradeResponseDto.setOfferorQuantity(tradeEntity.getOfferorQuantity());
        tradeResponseDto.setOffereeQuantity(tradeEntity.getOffereeQuantity());
        tradeResponseDto.setStatus(tradeEntity.getStatus());

        tradeResponseDto.setOfferorListing(toListingShortDTO(offerorListing));
        tradeResponseDto.setOffereeListing(toListingShortDTO(offereeListing));

        return tradeResponseDto;

    }

    // convert ListingEntity → ListingShortDTO

    public static ListingShortDTO toListingShortDTO(ListingEntity listingEntity){
        if(listingEntity == null) return null;

        return new ListingShortDTO(
                listingEntity.getId(),
                listingEntity.getName(),
                listingEntity.getImageUrl());

    }
}
