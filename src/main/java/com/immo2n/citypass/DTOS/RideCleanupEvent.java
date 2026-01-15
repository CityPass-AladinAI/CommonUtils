package com.immo2n.citypass.DTOS;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideCleanupEvent {
    private String rideId;
    private String driverId;
    private String riderId;
    private String reason;
}
