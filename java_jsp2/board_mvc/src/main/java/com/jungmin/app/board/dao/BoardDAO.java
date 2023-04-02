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
	
	
}
