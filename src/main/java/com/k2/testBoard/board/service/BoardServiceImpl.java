package com.k2.testBoard.board.service;

import com.k2.testBoard.board.dto.BoardInsertDto;
import com.k2.testBoard.board.dto.BoardResDto;
import com.k2.testBoard.board.dto.BoardUpdateDto;
import com.k2.testBoard.board.dto.BoardDto;
import com.k2.testBoard.board.repository.BoardRepository;
import com.k2.testBoard.util.CommonResponse;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }


    @Override
    public int insertBoard(BoardInsertDto boardInsertDto) {
        return boardRepository.insertBoard(boardInsertDto);
    }

    @Override
    public BoardResDto getBoard(Long boardId) {
        return boardRepository.getBoard(boardId);
    }

    @Override
    public int updateBoard(BoardUpdateDto boardUpdateDto) {
        return boardRepository.updateBoard(boardUpdateDto);
    }

    @Override
    public int deleteBoard(Long boardId) {
        return boardRepository.deleteBoard(boardId);
    }
}
