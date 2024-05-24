package com.k2.testBoard.board.service;

import com.k2.testBoard.board.dto.BoardInsertDto;
import com.k2.testBoard.board.dto.BoardDto;
import com.k2.testBoard.board.dto.BoardResDto;
import com.k2.testBoard.board.dto.BoardUpdateDto;
import com.k2.testBoard.util.CommonResponse;

public interface BoardService {

    int insertBoard(BoardInsertDto boardCreateDto);
    BoardResDto getBoard(Long boardId);
    int updateBoard(BoardUpdateDto boardUpdateDto);
    int deleteBoard(Long boardId);




}
