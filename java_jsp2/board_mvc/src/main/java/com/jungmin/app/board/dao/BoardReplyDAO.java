package com.jungmin.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jungmin.app.board.vo.BoardReplyVO;
import com.jungmin.app.mybatis.config.MyBatisConfig;

public class BoardReplyDAO {
	SqlSessionFactory sessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;
	
	public BoardReplyDAO() {
		sqlSession = sessionFactory.openSession(true);
	}
	
	// 댓글 목록 가져오기
	public List<BoardReplyVO> getReplyList(int boardNum) {
		return sqlSession.selectList("Board.getReplyList", boardNum);
	}
	
	// 댓글 작성하기
	public void insertReply(BoardReplyVO reply) {
		sqlSession.insert("Board.insertReply", reply);
	}
	
	// 댓글 수정하기
	public void updateReply(BoardReplyVO reply) {
		sqlSession.update("Board.updateReply", reply);
	}
	
	public void deleteReply(int replyNum) {
		sqlSession.delete("Board.deleteReply", replyNum);
	}
}
