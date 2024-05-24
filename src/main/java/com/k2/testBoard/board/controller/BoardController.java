package com.k2.testBoard.board.controller;

import com.k2.testBoard.board.dto.BoardInsertDto;
import com.k2.testBoard.board.dto.BoardResDto;
import com.k2.testBoard.board.dto.BoardUpdateDto;
import com.k2.testBoard.board.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
@Slf4j
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping()
    public int createBoard(@RequestBody BoardInsertDto boardCreateDto){
        return boardService.insertBoard(boardCreateDto);
    }

    @GetMapping("/{boardId}")
    public BoardResDto getBoard(@PathVariable("boardId") Long boardId){
        return boardService.getBoard(boardId);
    }

//    @GetMapping()
//    public BoardResDto getBoardList(){
//        Pagination pagination = new Pagination(policyTotalCnt, acraPolicyListReqDto.getCurrentPage(),acraPolicyListReqDto.getRowCnt());
//
//
//        return boardService.getBoardList();
//    }

    @PatchMapping()
    public int updateBoard(@RequestBody BoardUpdateDto boardUpdateDto){
        return boardService.updateBoard(boardUpdateDto);
    }

    @DeleteMapping("/{boardId}")
    public int deleteBoard(@PathVariable("boardId") Long boardId){
        return boardService.deleteBoard(boardId);
    }

}
