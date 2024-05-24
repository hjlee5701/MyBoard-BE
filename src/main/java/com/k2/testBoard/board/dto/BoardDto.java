package com.k2.testBoard.board.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BoardDto {
    private Long boardId;
    private String title;
    private String content;
}
