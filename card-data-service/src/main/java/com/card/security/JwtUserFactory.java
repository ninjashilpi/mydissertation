package com.card.security;

import com.card.model.User;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getId(),
                user.getPhoneNumber(),
                user.getPassword(),
                user.getRole(),
                user.getStatus().equals("1") ? true: false
        );
    }
}
