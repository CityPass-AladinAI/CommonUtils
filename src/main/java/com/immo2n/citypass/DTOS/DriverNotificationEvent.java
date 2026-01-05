package com.immo2n.citypass.DTOS;


import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class DriverNotificationEvent {
    private String driverId;
    private String rideId;
    private double pickupLat;
    private double pickupLng;
    private Instant offerExpiryTime;


}
