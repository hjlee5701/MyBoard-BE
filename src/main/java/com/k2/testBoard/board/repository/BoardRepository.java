package com.k2.testBoard.board.repository;

import com.k2.testBoard.board.dto.BoardInsertDto;
import com.k2.testBoard.board.dto.BoardDto;
import com.k2.testBoard.board.dto.BoardResDto;
import com.k2.testBoard.board.dto.BoardUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Mapper : DB 쿼리와 <-> 자바 메서드()를 매핑하는 역할
 * Repository : XML에 작성할 SQL 쿼리와 연결될 메서드들을 정의할 파일
  */

@Mapper
@Repository("boardRepository")
public interface BoardRepository {
    int insertBoard(BoardInsertDto boardCreateDto);

    BoardResDto getBoard(Long boardId);

    int updateBoard(BoardUpdateDto boardUpdateDto);
    int deleteBoard(Long boardId);

}
