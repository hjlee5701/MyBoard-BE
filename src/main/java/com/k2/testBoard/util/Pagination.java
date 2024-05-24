//package com.k2.testBoard.util;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import lombok.Getter;
//import lombok.Setter;
//
//@Setter
//@Getter
//public class Pagination {
//    private int currentPage;    // 현재 페이지
//    private int rowCnt;         // 페이지당 출력할 페이지 갯수
//    private int pageSize = 10;  // 하단 페이지 갯수
//    private int totalRecordCnt; // 전체 record 갯수
//    private int totalPageCnt;   // 전체 페이지 갯수
//    private int firstPage;      // 페이지 리스트 첫번째 번호
//    private int lastPage;       // 페이지 리스트 마지막 번호
//
//    public int setCurrentPage(int currentPage){
//        this.currentPage = currentPage;
//    }
//    public Pagination(int totalRecordCnt, int currentPage, int rowCnt){
//        this.setCurrent(currentPage);
//    }
//
//}
//
//
///**
//public class Pagination {
//    // 현재페이지
//    private int currentPage;
//    // 페이지당 출력할 페이지 갯수
//    private int rowCnt;
//    @JsonIgnore
//    // 화면 하단 페이지 사이즈 1~10, 10~20 20~30 ...
//    private int pageSize = 10;
//
//    // 전체 데이터 개수
//    private int totalRecordCount;
//
//    // 전체 페이지 개수
//    private int totalPageCount;
//
//    // 페이지 리스트의 첫 페이지 번호
//    private int firstPage;
//
//    // 페이지 리스트의 마지막 페이지 번호
//    private int lastPage;
//
//    @JsonIgnore
//    // SQL의 조건절에 사용되는 첫 RNUM
//    private int firstRecordIndex;
//
//    @JsonIgnore
//    // SQL의 조건절에 사용되는 마지막 RNUM
//    private int lastRecordIndex;
//
//    @JsonIgnore
//    // 이전 페이지 존재 여부
//    private boolean hasPreviousPage;
//
//    @JsonIgnore
//    // 다음 페이지 존재 여부
//    private boolean hasNextPage;
//
//    @JsonIgnore
//    private int startRow; // #{start}
//
//    @JsonIgnore
//    /*최상단 글번호 (목록 그려줄때 -1 씩해서 보여주면됨)
//    private int rowNum;
//
//*/
//    public Pagination() {
//        super();
//    }
///*
//    public Pagination(int currentPage) {
//        //강제입력방지
//        if (currentPage < 1) {
//            currentPage = 1;
//        }
//
//        this.currentPage = currentPage;
//    }
//*/
//    public Pagination(int totalRecordCount, int currentPage, int rowCnt){
//        setCurrentPage(currentPage);
//        setTotalRecordCount(totalRecordCount, rowCnt);
//
//        rowNum = totalRecordCount - (currentPage - 1) * rowCnt;
//    }
//
//    public void setTotalRecordCount(int totalRecordCount, int rowCnt) {
//        this.totalRecordCount = totalRecordCount;
//        this.rowCnt = rowCnt;
//
//        if (totalRecordCount > 0) {
//            calculation();
//        }
//    }
//
//    public void setTotalRecordCount(int totalRecordCount) {
//        this.totalRecordCount = totalRecordCount;
//        this.rowCnt = 10;
//
//        if (totalRecordCount > 0) {
//            calculation();
//        }
//    }
//
//    private void calculation() {
//
//        // 전체 페이지 수 (현재 페이지 번호가 전체 페이지 수보다 크면 현재 페이지 번호에 전체 페이지 수를 저장)
//        totalPageCount = ((totalRecordCount - 1) / this.getRowCnt()) + 1;
//        if (this.getCurrentPage() > totalPageCount) {
//            this.setCurrentPage(totalPageCount);
//        }
//
//        // 페이지 리스트의 첫 페이지 번호
//        firstPage = ((this.getCurrentPage() - 1) / this.getPageSize()) * this.getPageSize()+1;
//
//        // 페이지 리스트의 마지막 페이지 번호 (마지막 페이지가 전체 페이지 수보다 크면 마지막 페이지에 전체 페이지 수를 저장)
//        lastPage = firstPage + this.getPageSize() - 1;
//        if (lastPage > totalPageCount) {
//            lastPage = totalPageCount;
//        }
//
//        // SQL의 조건절에 사용되는 첫 RNUM
//        firstRecordIndex = (this.getCurrentPage() - 1) * this.getRowCnt()+1;
//
//        // SQL의 조건절에 사용되는 마지막 RNUM
//        lastRecordIndex = this.getCurrentPage() * this.getRowCnt();
//
//        // 이전 페이지 존재 여부
//        hasPreviousPage = firstPage == 1 ? false : true;
//        if(hasPreviousPage == false) {
//            if(currentPage != firstPage) {
//                hasPreviousPage = true;
//            }else {
//                hasPreviousPage = false;
//            }
//        }
//
//        // 다음 페이지 존재 여부
//        hasNextPage = (lastPage * this.getRowCnt()) >= totalRecordCount ? false : true;
//        if(hasNextPage == false) {
//            //마지막 페이지에서 현재페이지가 마지막 페이지가 아닌경우 next처리
//            if(currentPage != lastPage) {
//                hasNextPage = true;
//            }else {
//                hasNextPage = false;
//            }
//        }
//
//        startRow = (currentPage-1)*rowCnt;
//    }
//
//}
