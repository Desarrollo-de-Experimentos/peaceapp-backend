package com.upc.pre.peaceapp.models;

import com.upc.pre.peaceapp.shared.documentation.models.AuditableAbstractAggregateRoot;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "locations")
public class Location extends AuditableAbstractAggregateRoot<Location> {
    @Getter
    @Setter
    @Column(name="latitude", nullable = false, length = 30)
    private String aLatitude;

    @Getter
    @Setter
    @Column(name="longitude", nullable = false, length = 30)
    private String aLongitude;

    @Getter
    @Setter
    @Column(name="id_report", nullable = false)
    private Long idReport;

    public Location(String aLatitude, String aLongitude, Long idReport) {
        verifyCorrectLatitudeLongitude(aLatitude, aLongitude); // Validate fields before setting them
        this.aLatitude = aLatitude;
        this.aLongitude = aLongitude;
        this.idReport = idReport;
    }

    public Location() {
    }

    public void verifyCorrectLatitudeLongitude(String aLatitude, String aLongitude) {
        if (aLatitude == null || aLatitude.isEmpty()) {
            throw new IllegalArgumentException("Latitude cannot be null or empty");
        }
        if (aLongitude == null || aLongitude.isEmpty()) {
            throw new IllegalArgumentException("Longitude cannot be null or empty");
        }
    }

    public void setIdReport(Long idReport) {
        if (idReport == null || idReport <= 0) {
            throw new IllegalArgumentException("ID Report cannot be null or less than or equal to 0");
        }
        this.idReport = idReport;
    }
}
