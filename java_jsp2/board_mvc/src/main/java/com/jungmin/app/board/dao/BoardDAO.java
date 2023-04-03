package com.jungmin.app.board.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jungmin.app.board.vo.BoardVO;
import com.jungmin.app.mybatis.config.MyBatisConfig;

public class BoardDAO {
	SqlSessionFactory sqlSessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;
	
	// �⺻ ������
	public BoardDAO() {
		sqlSession = sqlSessionFactory.openSession(true); // auto commit �ɼ� ��
	}
	
	// �Խñ� ���
	public List<BoardVO> getList(int startRow, int endRow) {
		HashMap<String, Integer> pageMap = new HashMap<>();
		
		pageMap.put("startRow", startRow);
		pageMap.put("endRow", endRow);
		
		return sqlSession.selectList("Board.getList", pageMap);
	}
	
	// �Խñ� ��ü ����
	public int getTotal() {
		int total = sqlSession.selectOne("Board.getTotal");
		
		return total;
	}
	
	// �Խñ� �ۼ�
	public boolean insertBoard(BoardVO board) {
		int result = sqlSession.insert("Board.insertBoard", board);
		
		return result == 1 ? true : false;
	}
	
	// �ֱ� ������(�Խñ� ��ȣ) ��������
	public int getSeq() {
		int seq = sqlSession.selectOne("Board.getSeq");
		
		return seq;
	}
	
	// �Խñ� �� ����
	public BoardVO getDetail(int boardNum) {
		return sqlSession.selectOne("Board.getDetail", boardNum);
	}
	
	// �Խñ� ��ȸ�� ����
	public void updateReadCount(int boardNum) {
		sqlSession.update("Board.updateReadCount", boardNum);
	}
	
	public void deleteBoard(int boardNum) {
		sqlSession.delete("Board.deleteBoard", boardNum);
	}
}
