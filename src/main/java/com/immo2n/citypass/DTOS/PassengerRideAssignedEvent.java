package com.immo2n.citypass.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PassengerRideAssignedEvent {
    private String rideId;
    private String driverId;
}
