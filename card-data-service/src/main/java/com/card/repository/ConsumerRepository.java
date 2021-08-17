package com.card.repository;

import org.springframework.stereotype.Repository;

import com.card.model.User;

import java.util.List;

@Repository
public interface ConsumerRepository {

    boolean save(User consumer);

    User findById(Long id);

    List<User> findAll();

    User findByPhoneNumber(String phoneNumber);

    boolean existsByPhoneNumber(String phoneNumber);
}
