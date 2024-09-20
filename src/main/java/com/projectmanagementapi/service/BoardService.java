package com.projectmanagementapi.service;

import com.projectmanagementapi.entity.Board;
import com.projectmanagementapi.repository.BoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;

	public Board createBoard(Board board) {
		return boardRepository.save(board);
	}

	// Additional services for board updates and deletion
}
