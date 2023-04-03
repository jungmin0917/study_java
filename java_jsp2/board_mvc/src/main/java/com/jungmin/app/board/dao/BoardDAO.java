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
	
	// 게시글 작성
	public boolean insertBoard(BoardVO board) {
		int result = sqlSession.insert("Board.insertBoard", board);
		
		return result == 1 ? true : false;
	}
	
	// 최근 시퀀스(게시글 번호) 가져오기
	public int getSeq() {
		int seq = sqlSession.selectOne("Board.getSeq");
		
		return seq;
	}
	
	// 게시글 상세 보기
	public BoardVO getDetail(int boardNum) {
		return sqlSession.selectOne("Board.getDetail", boardNum);
	}
	
	// 게시글 조회수 증가
	public void updateReadCount(int boardNum) {
		sqlSession.update("Board.updateReadCount", boardNum);
	}
	
	public void deleteBoard(int boardNum) {
		sqlSession.delete("Board.deleteBoard", boardNum);
	}
}
