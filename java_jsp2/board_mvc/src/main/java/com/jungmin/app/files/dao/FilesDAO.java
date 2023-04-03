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
	
	// �Խñ��� ÷�� ���� �߰� (���� �����ص� ��ȯ�� ���� �ϰ���)
	public void insertFile(MultipartRequest multi, int boardNum) {
		Enumeration<String> files = multi.getFileNames(); // Enumeration ��ü�� getFileNames() �޼ҵ�� ���ε�� ���ϵ��� �̸��� ������
		FilesVO vo = new FilesVO();
		
		while(files.hasMoreElements()) { // ���� ������ ���� ������ �ݺ�
			
			// ����ڰ� ���ε��� ���� �±��� name
			// name �������� �ش� ������ ���ε��� �� ����� <input type="file"> �±��� name �Ӽ� ���� �����
			String name = files.nextElement(); // ���� ���Ϸ� �Ѿ
			
			// ����ڰ� ���ε��� ���� ���� �̸�
			String original = multi.getOriginalFileName(name); // Ȥ�� ���ϸ��� �ߺ��� ���, �ڵ����� ����Ǳ� ������, ���� �̸��� �������ش�
			
			// �ߺ� �� ��å�� ����� �̸�
			String systemName = multi.getFilesystemName(name); // 
			
			// �츮�� ÷�������� �ִ� 3������ ���� �� �ְ� ������µ�, null�� ���� ����
			if(systemName == null) {
				continue;
			}
			
			vo.setFileName(systemName); // �ߺ� ���� �̸�
			vo.setBoardNum(boardNum);
			vo.setFileNameOriginal(original); // ���� ���� �̸�

			sqlSession.insert("Files.insertFile", vo);
		}
	}
	
	// �Խñ� ÷�� ���� �������� (�ִ� 3���̹Ƿ� List�� �޴´�). ����: ArrayList�� �ƴϰ� selectList�� ��ȯ Ÿ���� List��
	public List<FilesVO> getFiles(int boardNum){
		return sqlSession.selectList("Files.getFiles", boardNum);
	}
}
