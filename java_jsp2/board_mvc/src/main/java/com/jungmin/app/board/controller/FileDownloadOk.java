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
		
		// �ٿ�ε� ������ ������ �̵� �ʿ���� �ʳ�?
		
		ActionForward forward = new ActionForward();
		
		// ���ε� �Ǿ��ִ� ��� (�����ε� ����� ������) ����
		String saveFolder = "D:\\JAVA19_hjm\\git\\study_java\\java_jsp2\\board_mvc\\src\\main\\webapp\\app\\upload";
		// GET ������Ʈ������ fileName ���� �޾���
		String fileName = req.getParameter("fileName");
		
		// �������� Ŭ���̾�Ʈ�� �����ؾ� �ϹǷ�, ����Ʈ �ڵ带 �����ϱ� ���� Stream�� �̿��� ���̴�
		InputStream is = null; // �ش� ���� ��θ� �Է� ��Ʈ���� ���� ����
		OutputStream os = null; // ����� ��Ʈ���� ��� (����)
		
		boolean check = true; // ������ �������� ����� �о�Դ��� ����
		
		// ���尴ü File ��ü�� ����Ͽ� ���Ͽ� ���� ���� ��´�
		// ���ڿ��� �ش� ������ �����θ� �Է����ش�
		File file = null;
		
		try {
			file = new File(saveFolder, fileName);
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) { // FileNotFound ���� ����
			check = false;
			e.printStackTrace();
		}
		
		resp.setContentType("application/octet-stream"); // ���� �ٿ�ε忡 �ʼ�. ������ ������ Ÿ�� ����.
		resp.setHeader("Content-Description", "JSP Generated Data"); // �� �������� ������ ���� ������. �ʼ��� �ƴ�
		
		if(check) { // ������ �� ����������
			try {
				// ���� ���� ��, ��� ���� ���� ó����
				
				// ���� ���� �� ���� �̸��� ���ڵ��� ���� (���� ���ڵ� ���� ����)
				fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
				
				// �ٿ�ε�Ǵ� ������ �̸��� ����
				resp.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
				
				// �ٿ�ε�Ǵ� ������ MIME Ÿ���� ����. MIME Ÿ���� ������ ������ ������ ��, ������ ������ ������ �����ϱ� ���� ��Ÿ�������̴�.
				resp.setHeader("Content-Type", "application/octet-stream; charset=utf-8");
				
				// �ٿ�ε�Ǵ� ������ ũ�⸦ ����. �ٿ�ε� �ӵ� ������ ������ ��.
				resp.setHeader("Content-Length", file.length() + "");
				
				// ���� ���������� ��� ��Ʈ���� ������ ���� �����غ���
				os = resp.getOutputStream(); // Ŭ���̾�Ʈ���� ������ ��� ��Ʈ���� �����ͼ� OutputStream ��ü�� ����
				
				// ���� ���� �� ������ ������ ����Ʈ �迭�� �о�;� �ϱ⿡ ����Ʈ �迭 ������ (file.length() �޼ҵ� ����Ͽ� ���� ����)
				byte[] b = new byte[(int)(file.length())];
				
				int data = 0; // ���� ����Ʈ�κ��� �� �ʱ�ȭ
				
				while((data = is.read(b)) > 0) { // ���� ����Ʈ �κ��� 0���� Ŭ ��� (���� �о�� ���� �ִٴ� ��)
					os.write(b, 0, data);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// �׻� ��Ʈ���� ��������� �ݾ���� ��
				// ���� ó������ ������ ���� �� ���� ��Ʈ�� �ݱ�
				try {
					// ��½�Ʈ��.close()�� �ؾ� Ŭ���̾�Ʈ���� ������ �ȴ�
					if(is != null) {
						is.close();
					}
					
					if(os != null) {
						os.close();
					}
				} catch (Exception e) { // ��Ʈ���� ������ ������ �޸𸮿� ��� ������������ ���α׷� ���� ����
					throw new RuntimeException();
				}
				
			}
		}
		
		return null; // ������ �̵��� �ʿ� ������ null ��ȯ�ص� ��
	}
}
