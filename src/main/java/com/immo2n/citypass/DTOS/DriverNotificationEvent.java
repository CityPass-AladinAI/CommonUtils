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
    private  String riderId;
    private Double pickupLat;       // changed to Double
    private Double pickupLng;       // changed to Double
    private Double destinationLat;  // already Double
    private Double destinationLng;  // already Double
    private String preferences;
    private Long timestamp;
    private String vehicleType;
    private Instant offerExpiryTime;
}
