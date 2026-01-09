package com.immo2n.citypass.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import java.time.Instant;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverNotificationEvent {
    private String driverId;
    private String rideId;
    private double pickupLat;
    private double pickupLng;
    private Double destinationLat; // changed to object
    private Double destinationLng; // changed to object
    private String preferences;
    private long timestamp;
    private String vehicleType;
    private Instant offerExpiryTime;
}
