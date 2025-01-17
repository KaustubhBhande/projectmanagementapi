package com.projectmanagementapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectmanagementapi.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}