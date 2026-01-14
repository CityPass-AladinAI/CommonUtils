package com.immo2n.citypass.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideStartedEvent {
    private Long rideId;
    private Long driverId;
    private Long riderId;

    private Long startedAt;

    private VehicleType vehicleType;


    public enum VehicleType {
        BIKE,
        CNG,
        CAR,
        BUS,
        AMBULANCE
    }
}

