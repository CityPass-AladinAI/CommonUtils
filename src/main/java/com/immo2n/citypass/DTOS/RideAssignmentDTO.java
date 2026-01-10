package com.immo2n.citypass.DTOS;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideAssignmentDTO {

    private String rideId;
    private String driverId;
    private VehicleType vehicleType;
    private long timestamp;

    public enum VehicleType {
        BIKE,
        CNG,
        CAR,
        BUS,
        AMBULANCE
    }

}
