package com.alvirg.exchange_app;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class User extends Base{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
