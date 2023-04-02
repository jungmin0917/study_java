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
	
	// 기본 생성자
	public BoardDAO() {
		sqlSession = sqlSessionFactory.openSession(true); // auto commit 옵션 켬
	}
	
	// 게시글 목록
	public List<BoardVO> getList(int startRow, int endRow) {
		HashMap<String, Integer> pageMap = new HashMap<>();
		
		pageMap.put("startRow", startRow);
		pageMap.put("endRow", endRow);
		
		return sqlSession.selectList("Board.getList", pageMap);
	}
	
	// 게시글 전체 개수
	public int getTotal() {
		int total = sqlSession.selectOne("Board.getTotal");
		
		return total;
	}
	
	
}
