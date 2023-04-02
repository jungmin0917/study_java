package com.jungmin.app.files.vo;

// �����
//CREATE TABLE JUNGMIN_FILES(
//	fileName VARCHAR2(2000) PRIMARY KEY,
//	boardNum NUMBER(38),
//	fileNameOriginal VARCHAR2(2000),
//	CONSTRAINT FK_FILES_BOARD FOREIGN KEY(boardNum)
//	REFERENCES JUNGMIN_BOARD(boardNum)
//);

public class FilesVO {
	private String fileName;
	private int boardNum;
	private String fileNameOriginal;
	
	// �⺻ ������
	public FilesVO() {;}

	// getter, setter
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getFileNameOriginal() {
		return fileNameOriginal;
	}

	public void setFileNameOriginal(String fileNameOriginal) {
		this.fileNameOriginal = fileNameOriginal;
	}
	
	
}
