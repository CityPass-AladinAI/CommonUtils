package com.immo2n.citypass.DTOS;

import lombok.Data;

@Data
public class RideEventDTO {
    private String rideId;
    private String driverId;
    private double pickupLat;
    private double pickupLng;
    private Double destinationLat;
    private Double destinationLng;
    private String preferences;
    private long timestamp;

    private VehicleType vehicleType; // Corrected naming

    public enum VehicleType {   // PascalCase
        BIKE,
        BUS,
        CNG,
        AMBULANCE
    }
}
