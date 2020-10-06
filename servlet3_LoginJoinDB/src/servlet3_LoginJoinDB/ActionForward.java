package servlet3_LoginJoinDB;

//페이지 이동을 처리하기 위한 클래스 이다
//(URL패턴에 따른 조건분기 지원클래스)

public class ActionForward  {
	private boolean isRedirect = false; // 리다이렉트 여부
	private String nextPath = null;
	
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	public String getNextPath() {
		return nextPath;
	}
	public void setNextPath(String nextPath) {
		this.nextPath = nextPath;
	}
	
	
}
