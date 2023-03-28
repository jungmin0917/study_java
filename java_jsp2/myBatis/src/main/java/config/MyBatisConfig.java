package config;

// xml 파일들을 자바가 읽을 수 있도록 MyBatis 관련 설정을 하는 파일

import java.io.IOException;
import java.io.Reader; // 문자 스트림을 읽어오기 위한 메서드를 정의하고 있는 클래스

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// SqlSessionFactoryBuilder를 통해 SqlSessionFactory 객체를 생성한다.
// 생성 시, SqlSessionFactoryBuilder 인스턴스 생성하고, 해당 클래스의 build 메소드를 통해 생성하는데,
// 이 과정에서 MyBatis 관련 파일을 읽는 Resources의 getResourceAsReader 메소드를 사용한다. 그 인수로는 config.xml의 경로를 적는다.

// 길게 적긴 했는데 결국 설정 파일을 불러와서 SqlSessionFactory 객체를 만드는 클래스이다.
public class MyBatisConfig {
	private static SqlSessionFactory sqlSession_f;
	
	// static 부분은 딱 한 번만 실행이 됨 (맨 처음 애플리케이션이 실행될 때)
	// 우리가 SqlSessionFactory 클래스를 로드하면서 기본적으로 설정할 부분들을 적자
	static {
		try {
			String resource = "./config/config.xml"; // config.xml 경로 설정 (MyBatisConfig.java는 config와 같이 있는데 왜 이렇게 되는지 모르겠음) 
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSession_f = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("초기화 문제 발생, MyBatisConfig.java파일에서 발생함");
		}
	}

	// setter는 필요없고, getter만 만들었음 (외부에서 가져다 쓸 수 있도록)
	public static SqlSessionFactory getSqlsession_f() {
		return sqlSession_f;
	}
}
