package com.immo2n.citypass.DTOS;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
    public class DriverAcceptanceDTO {
    private String driverId;
    private String rideId;
    private  String riderId;
      private VehicleType vehicleType;



    public enum VehicleType {
        BIKE,
        CNG,
        CAR,
        BUS,
        AMBULANCE
    }
}
