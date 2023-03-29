package com.jungmin.app.action;

public class ActionForward {
	// execute 반환 후 어디로 갈 건지, 어떻게 갈 건지에 대한 멤버 변수(필드) 정의
	private String path; // execute 후 어디로 갈 건지 
	private boolean isRedirect; // execute 후 어떻게 갈 건지 (리다이렉트인 경우와 forward인 경우 뿐이라, boolean으로 하자) (true일 땐 redirect로, false일 땐 forward로 가도록 함)
	
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
