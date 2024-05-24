package com.k2.testBoard.board.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BoardResDto {
    private int boardId;
    private String title;
    private String content;
    private Date regDate;
    private Date modifiedDate;

}
