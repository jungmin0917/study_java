package com.jungmin.app.board.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardDAO;
import com.jungmin.app.board.vo.BoardVO;
import com.jungmin.app.files.dao.FilesDAO;
import com.jungmin.app.files.vo.FilesVO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardModifyOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");

		ActionForward forward = new ActionForward();
		
		// ���⼭ �Խñ� �� ÷������ ���� �����ߴٰ� �ٽ� ����ϴ� ������ ������ ����
		BoardDAO boardDao = new BoardDAO();
		BoardVO board = new BoardVO();
		FilesDAO filesDao = new FilesDAO();
		String saveFolder = "C:\\Users\\jungmin\\Desktop\\eclipse_workspace\\study_java\\java_jsp2\\board_mvc\\src\\main\\webapp\\app\\upload";
		
		int megaByte = 1024 * 1024;
		int fileSize = megaByte * 5; // 5MB

//		���� �ø� ������ ������ ���ε� (��¿ �� ���� ���ε���� �ؾ� ��. boardNum�� �����;� �ϴ�...)
		MultipartRequest multi = null; // multipart �Ӽ����� �Ѿ�� form�� ó��
//		multi = new MultipartRequest(req, �������ϰ��, �ִ�����ũ��(����Ʈ ����), ���ڵ����, ��å);
		multi = new MultipartRequest(req, saveFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		
		// ���� boardNum���� �� �� �ٽ� ����ϹǷ� �װ� �� �����Ѵ�
		int boardNum = Integer.parseInt(multi.getParameter("boardNum")); // hidden���� �Ѿ�Դ�
		
//		�ϴ� ���� boardNum�� ��ϵǾ� �ִ� file�� ��ȸ�ϸ鼭 �����
		for(FilesVO file : filesDao.getFiles(boardNum)) {
			File f = new File(saveFolder, file.getFileName());
			
			if(f.exists()) {
				f.delete(); // ���� ����
			}
		}
		
//		���� DB���� ����
		filesDao.deleteFiles(boardNum);
		
//		���� DB���� ���
		filesDao.insertFile(multi, boardNum);
	
//		�Խñ��� ����-��� ���� UPDATE ���� �Ѵٰ� �Ѵ�.
		
//		�����
//		boardNum NUMBER(38),
//		boardTitle VARCHAR2(2000),
//		boardContent VARCHAR2(2000),
//		boardMemberId VARCHAR2(2000),
		
//		�Խñ� ����� ���� board ��ü �Ķ���� ����
		board.setBoardNum(boardNum);
		board.setBoardTitle(multi.getParameter("boardTitle"));
		board.setBoardContent(multi.getParameter("boardContent"));
		
		forward.setRedirect(false);
		forward.setPath("/board/BoardViewOk.bo?boardNum=" + boardNum);
		
		return forward;
	}

}
