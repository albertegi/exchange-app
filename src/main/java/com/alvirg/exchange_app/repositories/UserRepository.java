package com.alvirg.exchange_app.repositories;

import com.alvirg.exchange_app.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
