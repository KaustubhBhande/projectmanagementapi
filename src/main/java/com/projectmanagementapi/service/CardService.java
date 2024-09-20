package com.projectmanagementapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmanagementapi.entity.Card;
import com.projectmanagementapi.repository.CardRepository;

@Service
public class CardService {

	@Autowired
	private CardRepository cardRepository;

	public Card createCard(Card card) {
		return cardRepository.save(card);
	}

	public List<Card> getAllCards() {
		return cardRepository.findAll();
	}

	public void deleteCard(Long id) {
		cardRepository.deleteById(id);
	}
}
