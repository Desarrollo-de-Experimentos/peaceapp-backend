package com.upc.pre.peaceapp.unittest;

import com.upc.pre.peaceapp.models.UserProfile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserProfileTest {
    @Test
    public void UserProfileConstructor_VerifyCorrectFields_AssertEquals() {
        // Arrange
        UserProfile userProfile = new UserProfile(
                "John",
                "johndoe@mail.com",
                "password123",
                "Doe",
                "123456789",
                "user123",
                "profile_image.png"
        );

        // Act & Assert
        assertEquals("John", userProfile.getName(), "El nombre no coincide con el valor esperado");

    }
}
