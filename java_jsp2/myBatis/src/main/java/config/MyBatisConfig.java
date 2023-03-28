package config;

// xml ���ϵ��� �ڹٰ� ���� �� �ֵ��� MyBatis ���� ������ �ϴ� ����

import java.io.IOException;
import java.io.Reader; // ���� ��Ʈ���� �о���� ���� �޼��带 �����ϰ� �ִ� Ŭ����

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// SqlSessionFactoryBuilder�� ���� SqlSessionFactory ��ü�� �����Ѵ�.
// ���� ��, SqlSessionFactoryBuilder �ν��Ͻ� �����ϰ�, �ش� Ŭ������ build �޼ҵ带 ���� �����ϴµ�,
// �� �������� MyBatis ���� ������ �д� Resources�� getResourceAsReader �޼ҵ带 ����Ѵ�. �� �μ��δ� config.xml�� ��θ� ���´�.

// ��� ���� �ߴµ� �ᱹ ���� ������ �ҷ��ͼ� SqlSessionFactory ��ü�� ����� Ŭ�����̴�.
public class MyBatisConfig {
	private static SqlSessionFactory sqlSession_f;
	
	// static �κ��� �� �� ���� ������ �� (�� ó�� ���ø����̼��� ����� ��)
	// �츮�� SqlSessionFactory Ŭ������ �ε��ϸ鼭 �⺻������ ������ �κе��� ����
	static {
		try {
			String resource = "./config/config.xml"; // config.xml ��� ���� (MyBatisConfig.java�� config�� ���� �ִµ� �� �̷��� �Ǵ��� �𸣰���) 
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSession_f = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("�ʱ�ȭ ���� �߻�, MyBatisConfig.java���Ͽ��� �߻���");
		}
	}

	// setter�� �ʿ����, getter�� ������� (�ܺο��� ������ �� �� �ֵ���)
	public static SqlSessionFactory getSqlsession_f() {
		return sqlSession_f;
	}
}
