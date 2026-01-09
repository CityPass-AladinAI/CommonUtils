//package com.immo2n.citypass.DTOS;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.Builder;
//
//import java.time.Instant;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//public class RideEventDTO {
//
//    private String rideId;
//    private String driverId;
//
//    private double pickupLat;
//    private double pickupLng;
//
//    private Double destinationLat;
//    private Double destinationLng;
//
//    private String preferences;
//    private long timestamp;
//
//    private VehicleType vehicleType;
//    private Instant offerExpiryTime;
//
//    public enum VehicleType {
//        BIKE,
//        BUS,
//        CNG,
//        AMBULANCE
//    }
//}






package com.immo2n.citypass.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideEventDTO {

    private String rideId;
    private String driverId;

    private Double pickupLat;
    private Double pickupLng;   // changed to Double

    private Double destinationLat;
    private Double destinationLng;

    private String preferences;
    private Long timestamp;     // changed to Long

    private VehicleType vehicleType;
    private Instant offerExpiryTime;

    public enum VehicleType {
        BIKE,
        BUS,
        CNG,
        AMBULANCE
    }
}
