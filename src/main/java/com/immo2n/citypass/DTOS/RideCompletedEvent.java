package com.immo2n.citypass.DTOS;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideCompletedEvent {
    private Long rideId;
    private Long driverId;
    private Long riderId;
    private Double finalFare;

    private Long completedAt;

    private VehicleType vehicleType;


    public enum VehicleType {
        BIKE,
        CNG,
        CAR,
        BUS,
        AMBULANCE
    }
}
