package com.immo2n.citypass.DTOS;

import lombok.Data;
import java.time.Instant;

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

    private VehicleType vehicleType;
    private Instant offerExpiryTime;

    public enum VehicleType {
        BIKE,
        BUS,
        CNG,
        AMBULANCE
    }
}
