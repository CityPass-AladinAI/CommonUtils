package com.immo2n.citypass.DTOS;

import lombok.Data;


@Data
public class RideEventDTO {
    private String rideId;
    private double pickupLat;
    private double pickupLng;
    private Double destinationLat;
    private Double destinationLng;
    private String preferences;
    private long timestamp;
}