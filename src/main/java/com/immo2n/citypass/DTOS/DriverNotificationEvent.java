package com.immo2n.citypass.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverNotificationEvent {
    private String driverId;
    private String rideId;
    private double pickupLat;
    private double pickupLng;
    private double destinationLat;
    private double destinationLng;
    private String preferences;
    private long timestamp;
    private String vehicleType;
    private Instant offerExpiryTime;
}
