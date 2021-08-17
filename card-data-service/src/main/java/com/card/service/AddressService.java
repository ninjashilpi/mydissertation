package com.card.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.card.model.Address;
import com.card.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address findById(Long id) {
        return addressRepository.findById(id);
    }

    public boolean save( Address address ) {
        return  addressRepository.save(address);
    }

}
