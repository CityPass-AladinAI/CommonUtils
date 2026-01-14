package com.immo2n.citypass.DTOS;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideRejectedEvent {
    //private Long rideId;
    //private Long driverId;
    private String reason;
    private String rideId;
    private String driverId;
    private String riderId;

}
