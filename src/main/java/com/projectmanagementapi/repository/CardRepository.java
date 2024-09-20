package com.projectmanagementapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectmanagementapi.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}