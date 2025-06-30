package com.alvirg.exchange_app;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/listings")
@RequiredArgsConstructor
public class ListingController {

    private final ListingService listingService;
    @PostMapping
    public ResponseEntity<ListingResponseDTO> createListing(@RequestBody CreateListingDTO dto){
       ListingResponseDTO createdListing = listingService.createListing(dto);
       return ResponseEntity.ok(createdListing);


    }


}
