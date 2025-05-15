package com.upc.pre.peaceapp.unittest;

import com.upc.pre.peaceapp.models.Alert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertDtoTest {
    @Test
    void testValidationFields() {
        Alert alert = new Alert(
                "Location",
                "Type",
                "Description",
                1,
                "ImageUrl",
                1L
        );

        assertEquals("Location2", alert.getLocation(), "La ubicación no coincide con el valor esperado");
        assertEquals("Type", alert.getType(), "El tipo no coincide con el valor esperado");
        assertEquals("Description", alert.getDescription(), "La descripción no coincide");
        assertEquals("ImageUrl", alert.getImageUrl(), "La URL de la imagen no coincide");
    }
}
