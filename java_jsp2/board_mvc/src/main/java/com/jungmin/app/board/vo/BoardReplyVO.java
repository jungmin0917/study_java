package com.jungmin.app.board.vo;

//	참고용
//	CREATE TABLE JUNGMIN_REPLY(
//		replyNum NUMBER(38) PRIMARY KEY,
//		boardNum NUMBER(38) REFERENCES JUNGMIN_BOARD(boardNum) ON DELETE CASCADE,
//		memberId VARCHAR2(1000) REFERENCES JUNGMIN_MEMBER(memberId),
//		replyContent VARCHAR2(2000)
//	);

public class BoardReplyVO {
	private int replyNum;
	private int boardNum;
	private String memberId;
	private String replyContent;
	
	// 기본 생성자
	public BoardReplyVO() {;}

	// getter, setter
	public int getReplyNum() {
		return replyNum;
	}

	public void setReplyNum(int replyNum) {
		this.replyNum = replyNum;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	
}
