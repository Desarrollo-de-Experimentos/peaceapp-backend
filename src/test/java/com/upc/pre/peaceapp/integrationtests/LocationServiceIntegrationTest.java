package com.upc.pre.peaceapp.integrationtests;

import com.upc.pre.peaceapp.models.Location;
import com.upc.pre.peaceapp.repositories.LocationRepository;
import com.upc.pre.peaceapp.schemas.LocationSchema;
import com.upc.pre.peaceapp.services.LocationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LocationServiceIntegrationTest {
    @Autowired
    private LocationService locationService;

    @Autowired
    private LocationRepository locationRepository;

    @MockBean
    private SimpMessagingTemplate messagingTemplate; // Mock WebSocket dependency

    @BeforeEach
    void setUp() {
        locationRepository.deleteAll();
    }

    @Test
    void shouldSaveLocationCorrectly() {
        // Given
        LocationSchema schema = new LocationSchema("12.345", "67.890", 1L);

        // When
        Location saved = locationService.saveLocation(schema);

        // Then
        assertNotNull(saved.getId());
        assertEquals("12.345", saved.getALatitude());
        assertEquals("67.890", saved.getALongitude());
        assertEquals(1L, saved.getIdReport());
    }

    @Test
    void shouldReturnAllLocations() {
        locationService.saveLocation(new LocationSchema("1.1", "2.2", 1L));
        locationService.saveLocation(new LocationSchema("3.3", "4.4", 1L));

        List<Location> all = locationService.getAllLocations();

        assertEquals(2, all.size());
    }

    @Test
    void shouldAggregateDangerousLocations() {
        locationService.saveLocation(new LocationSchema("1", "1", 1L));
        locationService.saveLocation(new LocationSchema("1", "1", 1L));
        locationService.saveLocation(new LocationSchema("2", "2", 1L));

        List<Location> result = locationService.obtainDangerousLocations(1);

        assertEquals(3, result.size());
    }
}