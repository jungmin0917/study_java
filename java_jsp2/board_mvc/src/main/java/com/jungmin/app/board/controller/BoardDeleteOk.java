package com.jungmin.app.board.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardDAO;
import com.jungmin.app.files.dao.FilesDAO;
import com.jungmin.app.files.vo.FilesVO;

public class BoardDeleteOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		
		// ���ε��� ������������ ������ �����ؾ� ��
		// �� �������� File ��ü�� delete �޼ҵ带 ����� ����
		
		// ���ε� ����� ��ġ
		String saveFolder = "D:\\JAVA19_hjm\\git\\study_java\\java_jsp2\\board_mvc\\src\\main\\webapp\\app\\upload";
		
		FilesDAO filesDao = new FilesDAO();
		BoardDAO boardDao = new BoardDAO();
		
		int boardNum = Integer.parseInt(req.getParameter("boardNum"));
		
		// ÷�������� ���� ���� �� �����Ƿ� ���� ÷�����ϵ� �̸��� �����;� ��
		// ���������� ���� ���� ����
		for(FilesVO file : filesDao.getFiles(boardNum)) { // ��ȸ�ϸ鼭 ó����
			File f = new File(saveFolder, file.getFileName()); // File ��ü�� �� ������ ����

			if(f.exists()) { // File.exists() : ���� ���翩�� Ȯ�� �޼ҵ�
				f.delete(); // ��ȸ�ϸ鼭 ���� ���� ���� ����
			}
		}
		
		// JUNGMIN_FILES DB���� ���� ���� ���ڵ� ����
		filesDao.deleteFiles(boardNum);
		
		// ���� �Խñ� ��������
		
		// JUNGMIN_BOARD DB���� �Խñ� ����
		boardDao.deleteBoard(boardNum);
		
		// ��� ���� �� ������� �̵����Ѿ� �ϹǷ� forward �ʿ�
		
		forward.setRedirect(false); // true�� �ص� ��� ���� (contextPath�� ����� �ϸ� ��)
//		forward.setPath(req.getContextPath() + "/app/board/boardList.jsp");
//		����ó�� �ٷ� boardList���� �� ��!!! (boardListOk���� ���� ���ľ� DB���� ������ �޾Ƽ� ǥ����)
		forward.setPath("/board/BoardListOk.bo"); // ��Ʈ�ѷ� ���ļ� ���� �ϱ�
		
		return forward;
	}

}







