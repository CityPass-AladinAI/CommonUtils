package com.immo2n.citypass.DTOS;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProviderSignupRequestDto {

    private String providerId;
    private String providerName;
    private String email;
    private String phoneNumber;

    private VehicleType vehicleType;
    private String licenseNumber;

    private String city;
    private boolean active;

    public enum VehicleType {
        BIKE,
        BUS,
        CNG,
        AMBULANCE
    }
}
