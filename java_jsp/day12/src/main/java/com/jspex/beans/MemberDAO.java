package com.jspex.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// DAO는 Data Access Object로서, DB에 액세스하려고 사용함
public class MemberDAO {
	Connection conn; // connection 객체
	PreparedStatement pstm; // prepare문
	ResultSet rs; // 결과
	
	// 외부에서 이름을 받아와서 해당 이름을 가진 데이터의 전체 데이터를 가져오기
	// MemberVO 객체를 저장할 건데, 동명이인이 있을 수 있고 몇 개가 될지 모르니까 ArrayList 자료구조에 담자
	public ArrayList<MemberVO> select(String name) {
		return null;
	}
	
}
