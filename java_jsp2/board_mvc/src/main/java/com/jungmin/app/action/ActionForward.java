package com.jungmin.app.action;

public class ActionForward {
	// execute ��ȯ �� ���� �� ����, ��� �� ������ ���� ��� ����(�ʵ�) ����
	private String path; // execute �� ���� �� ���� 
	private boolean isRedirect; // execute �� ��� �� ���� (�����̷�Ʈ�� ���� forward�� ��� ���̶�, boolean���� ����) (true�� �� redirect��, false�� �� forward�� ������ ��)
	
	// getter, setter
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
}
