package com.k2.testBoard.board.dto;

import lombok.Getter;

@Getter
public class BoardInsertDto {
    private Long boardId;
    private String title;
    private String content;
    private String writer;

}
