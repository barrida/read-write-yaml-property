package com.yaml.property.example.controller;

import com.yaml.property.example.entity.AddressResponse;
import com.yaml.property.example.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Suleyman Yildirim
 */
@RestController
@AllArgsConstructor
@RequestMapping("")
public class AddressController {

    @Autowired
    private final AddressService addressService;

    @GetMapping(value = "/get-address/{id}")
    public ResponseEntity<AddressResponse> getAddressDetails(@PathVariable long id) {
        AddressResponse addressResponse = addressService.getAddressDetails(id);
        return ResponseEntity.ok(addressResponse);
    }
}
