package com.iTech.accountservice.dto;

import java.util.Set;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class AccountDTO {
    private Long id;
    private String name;
    private String password;
    private String username;
    private Set<String> roles;
}
