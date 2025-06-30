package com.alvirg.exchange_app;

import com.alvirg.exchange_app.repositories.CategoryRepository;
import com.alvirg.exchange_app.repositories.ListingRepository;
import com.alvirg.exchange_app.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ListingService {

    private final ListingRepository listingRepository;
    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;
    private final ListingMapper listingMapper;

    public ListingResponseDTO createListing(CreateListingDTO dto){

        UserEntity user = userRepository.findById(dto.getUserId())
                .orElseThrow(()->new EntityNotFoundException("User not found!"));

        CategoryEntity category = categoryRepository.findById(dto.getCategoryId())
                .orElseThrow(()-> new EntityNotFoundException("Category not found!"));

        ListingEntity listing = ListingMapper.fromCreateListingDTO(dto);

        // Sets the foreign key relationships: the listing is now associated with a user and a category
        listing.setUser(user);
        listing.setCategory(category);

        // Saves the entity to the database
        //Converts the saved entity back into a ListingResponseDTO to return to the client.
        return listingMapper.toResponseDto(listingRepository.save(listing));

    }

    List<ListingResponseDTO> getListingsByUserId(Integer userId){
        return listingRepository.findByUserId(userId)
                .stream()
                .map(entity -> listingMapper.toResponseDto(entity))
                .collect(Collectors.toList());

    }

    public Optional<ListingResponseDTO> getListing(Integer id) {
        return listingRepository.findById(id)
                .map(listingMapper::toResponseDto);
    }



}
