package com.yaml.property.example.service;

import com.yaml.property.example.entity.AddressResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author Suleyman Yildirim
 */
@Service
public class AddressService {

    @Value("${mocking.enabled")
    private String isMocked;

    public AddressResponse getAddressDetails(final long id) {
        if (Boolean.parseBoolean(isMocked)) {
            return getStubbedAddresses(id);
        } else {
            return getAddressesFromRestApi(id);
        }
    }

    private AddressResponse getAddressesFromRestApi(long id) {
        return new AddressResponse(1, "some road", "London", "AG57KL");
    }

    private AddressResponse getStubbedAddresses(long id) {
        return new AddressResponse(19, "stubbed road", "Newcastle", "NE45WS");

    }
}
