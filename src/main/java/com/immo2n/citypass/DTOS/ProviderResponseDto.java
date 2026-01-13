package com.immo2n.citypass.DTOS;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProviderResponseDto {
    private Long id;
    private String email;
    private String phoneNumber;
    //private boolean enabled;
}
