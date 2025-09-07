package com.app;

// 컨트롤러(Action)가 처리한 결과 정보를 담아
// FrontController에게 넘겨주는 VO 역할
public class Result {
	private String path;
	private boolean isRedirect;
	
	public Result() {;}

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
