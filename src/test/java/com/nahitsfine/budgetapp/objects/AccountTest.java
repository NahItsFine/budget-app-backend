package com.nahitsfine.budgetapp.objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class AccountTest {
    @Test
    void ctorNullPtrExceptionTest(){
        Assertions.assertThrows(NullPointerException.class, () -> new Account(null));
    }

    @Test
    void ctorValidUUIDTest(){
        Account acc = new Account("username");
        Assertions.assertEquals(UUID.fromString(acc.getId().toString()), acc.getId());
    }
}
