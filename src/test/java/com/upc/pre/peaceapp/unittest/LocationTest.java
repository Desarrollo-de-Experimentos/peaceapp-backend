package com.upc.pre.peaceapp.unittest;


import com.upc.pre.peaceapp.models.Location;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {

    @Test
    void LocationConstructor_VerifyCorrectLatitudeLongitude_AssertEquals() {
        // Arrange
        String latitude = "12.345678";
        String longitude = "98.765432";
        Long idReport = 1L;

        // Act
        Location location = new Location(latitude, longitude, idReport);

        // Assert
        assertEquals(latitude, location.getALatitude(), "La latitud no coincide con el valor esperado");
        assertEquals(longitude, location.getALongitude(), "La longitud no coincide con el valor esperado");
        assertEquals(idReport, location.getIdReport(), "El ID del informe no coincide con el valor esperado");
    }

    @Test
    void LocationIdReport_SetIdReport_AssertEquals() {
        // Arrange
        String latitude = "12.345678";
        String longitude = "98.765432";
        Long idReport = 1L;

        // Act
        Location location = new Location(latitude, longitude, idReport);

        // Assert
        assertEquals(idReport, location.getIdReport(), "El ID del informe no coincide con el valor esperado");
    }
}
