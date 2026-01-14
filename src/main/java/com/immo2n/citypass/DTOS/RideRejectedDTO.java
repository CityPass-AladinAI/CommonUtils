package com.immo2n.citypass.DTOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideRejectedDTO {

    private Long driverId;

    private String reason;
}
