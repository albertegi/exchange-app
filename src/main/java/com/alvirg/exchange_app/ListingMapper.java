package com.alvirg.exchange_app;

public class ListingMapper {

    public static ListingEntity fromCreateListingDTO(CreateListingDTO dto){
        if(dto == null) return null;

        var listingEntity = new ListingEntity();
        listingEntity.setName(dto.getName());
        listingEntity.setDescription(dto.getDescription());
        listingEntity.setCondition(dto.getCondition());
        listingEntity.setQuantity(dto.getQuantity());
        listingEntity.setImageUrl(dto.getImageUrl());
        listingEntity.setVisible(dto.isVisible());
        listingEntity.setId(dto.getUserId());
        listingEntity.setId(dto.getCategoryId());

        return listingEntity;
    }
}
