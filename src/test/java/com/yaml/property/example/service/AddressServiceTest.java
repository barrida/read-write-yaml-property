package com.yaml.property.example.service;

import com.yaml.property.example.entity.AddressResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Suleyman Yildirim
 */

@ExtendWith(SpringExtension.class)
class AddressServiceTest {

    @InjectMocks
    AddressService addressService;

    @Test
    void testMockedGetAddressDetails() {
        ReflectionTestUtils.setField(addressService, "isMocked", String.valueOf(true));
        AddressResponse expectedResult = new AddressResponse(19, "stubbed road", "Newcastle", "NE45WS");
        AddressResponse actualResult = addressService.getAddressDetails(1L);
        assertEquals(expectedResult, actualResult);
    }
}