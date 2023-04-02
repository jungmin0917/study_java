package com.jungmin.app.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;
import com.jungmin.app.board.dao.BoardDAO;
import com.jungmin.app.board.vo.BoardVO;
import com.jungmin.app.files.dao.FilesDAO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BoardWriteOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		
		// ���⼭ ���� requst.parameter�� BoardVO ��ü �������ְ� DAO�� insertBoard() �޼��� ���
		
		BoardDAO boardDao = new BoardDAO();
		BoardVO board = new BoardVO();
		
		// form���� multipart/form-data�� ���۵� �����͸� ó���ϱ� ���� cos ���̺귯���� ��ġ�Ͽ���.
		// �ϴ� multipart Ÿ�� request�� �Խñ� ����, ����, �ۼ��� �� ������ �޾ƺ���.
		
		MultipartRequest multi = null;

		String saveFolder = "C:\\Users\\jungmin\\Desktop\\eclipse_workspace\\study_java\\java_jsp2\\board_mvc\\src\\main\\webapp\\app\\upload"; // ���� ���ε� ���� ���͸� ��ġ
		
		int megaByte = 1024 * 1024;
		int fileSize = megaByte * 5; // 5MB
		
//		�Ʒ��� ���� �����Ѵ�.
//		multi = new MultipartRequest(req, �������ϰ��, �ִ�����ũ��(����Ʈ ����), ���ڵ����, ��å);
//		�Ϲ� request ��ü�� multipartrequest ��ü�� ��ȯ
		multi = new MultipartRequest(req, saveFolder, fileSize, "UTF-8", new DefaultFileRenamePolicy());
		
		board.setBoardTitle(multi.getParameter("boardTitle"));
		board.setBoardContent(multi.getParameter("boardContent"));
		board.setBoardMemberId(multi.getParameter("boardMemberId"));
		
		// ���� ÷�������� �߰����� (�ϴ� ���� ���� DB ���̺��� ������)
		
		boardDao.insertBoard(board);
		// ��������� board ���̺� ��� �Ϸ�
		
		// ���ϵ� �߰��� ��
		FilesDAO fileDao = new FilesDAO();
		
		// insertFile�� �� boardNum�� �ʿ��ϹǷ�, ������ ���� ���� ������ ��
		fileDao.insertFile(multi, boardDao.getSeq());
		
		// ���� ���ε���� �Ϸ������� �Խñ� ��� �������� �̵���Ű��
		forward.setRedirect(true);
		forward.setPath(req.getContextPath() + "/board/BoardListOk.bo");
		
		return forward;
	}

}
