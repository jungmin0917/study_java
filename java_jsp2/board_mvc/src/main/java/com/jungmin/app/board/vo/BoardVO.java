package com.jungmin.app.board.vo;

// �Խ��� VO ��ü

// �����
// boardNum NUMBER(38), -- ���� 38�ڸ� ���� ���� ����
// boardTitle VARCHAR2(2000),
// boardContent VARCHAR2(2000),
// boardMemberId VARCHAR2(2000),
// boardDate DATE,
// readCount NUMBER(38),

public class BoardVO {
	private int boardNum;
	private String boardTitle;
	private String boardContent;
	private String boardMemberId;
	private String boardDate;
	private int readCount;
	
	// �⺻ ������
	public BoardVO() {;}

	// getter, setter
	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardMemberId() {
		return boardMemberId;
	}

	public void setBoardMemberId(String boardMemberId) {
		this.boardMemberId = boardMemberId;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
	
}
