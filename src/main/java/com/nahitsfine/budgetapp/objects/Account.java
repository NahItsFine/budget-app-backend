package com.nahitsfine.budgetapp.objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

/**
 * Class representing Account objects
 */
@Data
@AllArgsConstructor
public class Account {
    private final UUID id;
    private final String username;

    public Account(@NonNull String username) {
        this.id = UUID.randomUUID();
        this.username = username;
    } // TODO: unit tests

}
