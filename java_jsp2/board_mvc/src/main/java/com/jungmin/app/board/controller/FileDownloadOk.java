package com.jungmin.app.board.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jungmin.app.action.Action;
import com.jungmin.app.action.ActionForward;

public class FileDownloadOk implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		// 다운로드 끝나고 페이지 이동 필요없지 않나?
		
		ActionForward forward = new ActionForward();
		
		// 업로드 되어있는 경로 (서버인데 현재는 로컬임) 설정
		String saveFolder = "D:\\JAVA19_hjm\\git\\study_java\\java_jsp2\\board_mvc\\src\\main\\webapp\\app\\upload";
		// GET 쿼리스트링으로 fileName 전달 받았음
		String fileName = req.getParameter("fileName");
		
		// 서버에서 클라이언트로 전송해야 하므로, 바이트 코드를 전송하기 위해 Stream을 이용할 것이다
		InputStream is = null; // 해당 파일 경로를 입력 스트림에 먼저 저장
		OutputStream os = null; // 저장된 스트림을 출력 (전송)
		
		boolean check = true; // 파일을 서버에서 제대로 읽어왔는지 여부
		
		// 내장객체 File 객체를 사용하여 파일에 대한 정보 얻는다
		// 문자열로 해당 파일의 절대경로를 입력해준다
		File file = null;
		
		try {
			file = new File(saveFolder, fileName);
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) { // FileNotFound 예외 설정
			check = false;
			e.printStackTrace();
		}
		
		resp.setContentType("application/octet-stream"); // 파일 다운로드에 필수. 전송할 데이터 타입 설정.
		resp.setHeader("Content-Description", "JSP Generated Data"); // 웹 브라우저에 컨텐츠 설명 제공함. 필수는 아님
		
		if(check) { // 파일을 잘 가져왔으면
			try {
				// 파일 전송 전, 헤더 설정 등을 처리함
				
				// 파일 전송 시 파일 이름의 인코딩을 설정 (문자 인코딩 오류 방지)
				fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
				
				// 다운로드되는 파일의 이름을 지정
				resp.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
				
				// 다운로드되는 파일의 MIME 타입을 설정. MIME 타입은 웹에서 파일을 전송할 때, 파일의 종류와 형식을 지정하기 위한 메타데이터이다.
				resp.setHeader("Content-Type", "application/octet-stream; charset=utf-8");
				
				// 다운로드되는 파일의 크기를 설정. 다운로드 속도 개선에 도움이 됨.
				resp.setHeader("Content-Length", file.length() + "");
				
				// 이제 본격적으로 출력 스트림에 파일을 쓰고 전송해보자
				os = resp.getOutputStream(); // 클라이언트에게 전송할 출력 스트림을 가져와서 OutputStream 객체에 담음
				
				// 파일 전송 시 파일의 내용을 바이트 배열로 읽어와야 하기에 바이트 배열 선언함 (file.length() 메소드 사용하여 길이 얻어옴)
				byte[] b = new byte[(int)(file.length())];
				
				int data = 0; // 현재 바이트부분의 값 초기화
				
				while((data = is.read(b)) > 0) { // 다음 바이트 부분이 0보다 클 경우 (아직 읽어올 값이 있다는 뜻)
					os.write(b, 0, data);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 항상 스트림을 사용했으면 닫아줘야 함
				// 위의 처리에서 오류가 났든 안 났든 스트림 닫기
				try {
					// 출력스트림.close()를 해야 클라이언트에게 전송이 된다
					if(is != null) {
						is.close();
					}
					
					if(os != null) {
						os.close();
					}
				} catch (Exception e) { // 스트림이 닫히지 않으면 메모리에 계속 상주해있으니 프로그램 강제 종료
					throw new RuntimeException();
				}
				
			}
		}
		
		return null; // 페이지 이동할 필요 없으니 null 반환해도 됨
	}
}
