package com.upc.pre.peaceapp.unittest;

import com.upc.pre.peaceapp.models.Report;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportTest {
     @Test
    public void ReportConstructor_ValidateFields_AssertEquals() {
        // Arrange
        String title = "Test Title";
        String detail = "Test Detail";
        String type = "Test Type";
        Long idUser = 1L;
        String image = "Test Image";
        String address = "Test Address";

        // Act
        Report report = new Report(title, detail, type, idUser, image, address);

        // Assert
        assertEquals(title, report.getTitle(), "El título no coincide con el valor esperado");
        assertEquals(detail, report.getDetail(), "El detalle no coincide con el valor esperado");
        assertEquals(type, report.getType(), "El tipo no coincide con el valor esperado");
        assertEquals(idUser, report.getIdUser(), "El ID de usuario no coincide con el valor esperado");
        assertEquals(image, report.getImage(), "La imagen no coincide con el valor esperado");
    }

    @Test
    public void ReportSetDetail_SetDetail_AssertEquals() {
        // Arrange
        String title = "Test Title";
        String detail = "Test Detail";
        String type = "Test Type";
        Long idUser = 1L;
        String image = "Test Image";
        String address = "Test Address";

        Report report = new Report(title, detail, type, idUser, image, address);

        // Act
        String newDetail = "Updated Detail";
        report.setDetail(newDetail);

        // Assert
        assertEquals(newDetail, report.getDetail(), "El detalle no coincide con el valor esperado");
    }
}
