package com.immo2n.citypass.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class RideAcceptedEvent {
    private Long rideId;
    private Long driverId;
    private Long riderId;


    public Long getRideId() {
        return rideId;
    }

    public Long getDriverId() {
        return driverId;
    }

    public Long getRiderId() {
        return riderId;
    }

    public void setRideId(Long rideId) {
        this.rideId = rideId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public void setRiderId(Long riderId) {
        this.riderId = riderId;
    }

}
