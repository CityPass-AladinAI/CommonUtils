package com.immo2n.citypass.DTOS;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class EndRideDTO {
    private  Long driverId;
    private double finalFare;
}
