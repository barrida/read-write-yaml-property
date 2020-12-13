package com.yaml.property.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Suleyman Yildirim
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressResponse {
    private int houseNumber;
    private String addressLine;
    private String city;
    private String postcode;
}
