package com.ibookleague.user.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String email;

    @Column(unique = true)
    private String username;

    private String password;

    public enum UserRole {
        ADMIN("ROLE_ADMIN"),
        USER("ROLE_USER");

        UserRole(String value) {
            this.value = value;
        }
        private String value;

        public String getValue() {
            return value;
        }
    }
}

