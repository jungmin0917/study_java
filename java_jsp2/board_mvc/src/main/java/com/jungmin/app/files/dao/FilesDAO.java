package com.jungmin.app.files.dao;

import java.util.Enumeration;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.jungmin.app.files.vo.FilesVO;
import com.jungmin.app.mybatis.config.MyBatisConfig;
import com.oreilly.servlet.MultipartRequest;

public class FilesDAO {
	SqlSessionFactory sessionFactory = MyBatisConfig.getSqlSessionFactory();
	SqlSession sqlSession;
	
	public FilesDAO() {
		sqlSession = sessionFactory.openSession(true);
	}
	
	// 게시글의 첨부 파일 추가 (딱히 실패해도 반환값 없게 하겠음)
	public void insertFile(MultipartRequest multi, int boardNum) {
		Enumeration<String> files = multi.getFileNames(); // Enumeration 객체에 getFileNames() 메소드로 업로드된 파일들의 이름을 저장함
		FilesVO vo = new FilesVO();
		
		while(files.hasMoreElements()) { // 다음 파일이 있을 때까지 반복
			
			// 사용자가 업로드한 파일 태그의 name
			// name 변수에는 해당 파일을 업로드할 때 사용한 <input type="file"> 태그의 name 속성 값이 저장됨
			String name = files.nextElement(); // 다음 파일로 넘어감
			
			// 사용자가 업로드한 원본 파일 이름
			String original = multi.getOriginalFileName(name); // 혹시 파일명이 중복될 경우, 자동으로 변경되기 때문에, 원본 이름도 저장해준다
			
			// 중복 시 정책상 변경된 이름
			String systemName = multi.getFilesystemName(name); // 
			
			// 우리가 첨부파일을 최대 3개까지 담을 수 있게 만들었는데, null일 수가 있음
			if(systemName == null) {
				continue;
			}
			
			vo.setFileName(systemName); // 중복 없는 이름
			vo.setBoardNum(boardNum);
			vo.setFileNameOriginal(original); // 원본 파일 이름

			sqlSession.insert("Files.insertFile", vo);
		}
	}
	
	// 게시글 첨부 파일 가져오기 (최대 3개이므로 List로 받는다). 주의: ArrayList가 아니고 selectList의 반환 타입은 List임
	public List<FilesVO> getFiles(int boardNum){
		return sqlSession.selectList("Files.getFiles", boardNum);
	}
}
