package com.card.repository;

import org.springframework.stereotype.Repository;

import com.card.model.Card;

import java.util.List;

@Repository
public interface CardRepository {

    List<Card> findAllActiveByConsumerId(Long consumerId);
    Card findActiveById(Long id);
    Card findById(Long id);
    boolean changeDailyLimit(Card card);
    boolean activate(Long id);
    boolean deactivate(Long id);

}
