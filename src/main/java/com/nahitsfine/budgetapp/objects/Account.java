package com.nahitsfine.budgetapp.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

/**
 * Class representing Account objects
 */
@Data
public class Account {
    @NonNull private final UUID id;
    @NonNull private final String username;

    public Account(@NonNull String username) {
        this.id = UUID.randomUUID();
        this.username = username;
    }

}
