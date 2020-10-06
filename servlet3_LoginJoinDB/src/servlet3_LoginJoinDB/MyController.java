package servlet3_LoginJoinDB;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 : 자바클래스에서 http request 처리하는 클래스
// 코드중복을 피하는방법
/*
 * 1.함수 사용
 * 2.반복문사용
 * 3.배열사용
 */
public class MyController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}

	/*
	 * 서블릿으로 넘어온 요청을 처리하는 클래스 1.서비스 클래스 2.커맨드 클래스 3.액션클래스 이름은 달라도 의미는 같다. 논리적인 처리 위주
	 * 클래스 http web,app get,post 클라이언트 ---request----> 서버(웹서버,서비스들,dto,dao,db)
	 * <---response--
	 */
	public void doProcess(HttpServletRequest req, HttpServletResponse res) {
		// url패턴:*.do
		// 예) path1/path2/join.do,login.do
		// url패턴문구를 해석하는과정
		String requestURI = req.getRequestURI();
		int cmdIdx = requestURI.lastIndexOf("/") + 1;
		String command = requestURI.substring(cmdIdx); // 다음문자부터 끝까지 가져옴
		System.out.println("requestURI:" + requestURI);
		System.out.println("command:" + command);

		// 액션-서비스와 같은 개념, 논리적인 로직 코드들.
		ActionForward forward = null;
		Action action = null;

		// 보여줄 화면 URL
		String form = "MainForm.jsp?contentPage=member";
		
		try {
			if(command.equals("Mainform.do")) {
				forward=new ActionForward();
				forward.setRedirect(false);
				forward.setNextPath("MainForm.jsp");
			}else if(command.equals("LoginForm.do")) {
				forward = new ActionForward(); //객체생성!
				forward.setRedirect(false);
				forward.setNextPath(form + "LoginForm.jsp");
			}
			
			if(forward!=null) {
				if(forward.isRedirect()) {
					//화면이동(url)만한다.
					
					res.sendRedirect(forward.getNextPath());
				}else {
					RequestDispatcher dispatcher=req.getRequestDispatcher(forward.getNextPath());
					dispatcher.forward(req, res);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
