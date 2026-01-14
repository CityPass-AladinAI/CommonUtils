package com.immo2n.citypass.DTOS;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideRequestDto {
    private double pickupLat;
    private double pickupLng;
    private String pickupAddress;
    private double dropLat;
    private double dropLng;
    private String dropAddress;


}
