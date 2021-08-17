package com.card.repository;

import org.springframework.stereotype.Repository;

import com.card.model.Address;
@Repository
public interface AddressRepository {

    Address findById(Long id);

    boolean save(Address address);
}

