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
@Table(name = "_user")
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
