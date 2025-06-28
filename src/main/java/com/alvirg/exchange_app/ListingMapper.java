package com.alvirg.exchange_app;

import org.springframework.stereotype.Service;

@Service
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

    public static ListingEntity fromUpdateDto(UpdateListingDTO dto, ListingEntity existing) {
        if (dto == null || existing == null) return existing;

        existing.setName(dto.getName());
        existing.setDescription(dto.getDescription());
        existing.setCondition(dto.getCondition());
        existing.setQuantity(dto.getQuantity());
        existing.setImageUrl(dto.getImageUrl());
        existing.setVisible(dto.isVisible());
        return existing;
    }

    public static ListingResponseDTO toResponseDto(ListingEntity entity) {
        if (entity == null) return null;

        ListingResponseDTO dto = new ListingResponseDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setCondition(entity.getCondition());
        dto.setQuantity(entity.getQuantity());
        dto.setImageUrl(entity.getImageUrl());
        dto.setVisible(entity.isVisible());
        dto.setUserId(entity.getId());
        dto.setCategoryId(entity.getId());
        return dto;
    }

}
