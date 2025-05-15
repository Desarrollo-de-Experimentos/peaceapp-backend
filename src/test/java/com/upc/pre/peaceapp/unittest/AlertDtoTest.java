package com.upc.pre.peaceapp.unittest;

import com.upc.pre.peaceapp.models.Alert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlertDtoTest {
    @Test
    void AlertValidationFields_ValidateFields_AssertEquals() {
        Alert alert = new Alert(
                "Location",
                "Type",
                "Description",
                1,
                "ImageUrl",
                1L
        );

        assertEquals("Location", alert.getLocation(), "La ubicación no coincide con el valor esperado");
        assertEquals("Type", alert.getType(), "El tipo no coincide con el valor esperado");
        assertEquals("Description", alert.getDescription(), "La descripción no coincide");
        assertEquals("ImageUrl", alert.getImageUrl(), "La URL de la imagen no coincide");
    }

    @Test
    void SetDescription_DescriptionAlert_ThrowsExceptionMoreThan255() {
        Alert alert = new Alert(
                "Location",
                "Type",
                "Description",
                1,
                "ImageUrl",
                1L
        );

        String longDescription = "a".repeat(256); // 256 characters long

        alert.setDescription(longDescription);
        assertEquals(longDescription, alert.getDescription());
    }
}
