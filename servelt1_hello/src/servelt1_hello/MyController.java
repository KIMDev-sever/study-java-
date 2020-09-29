package servelt1_hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRefs;

// 서블릿: 클라이언트의 요청을 받아 처리하는 클래스
//		   server applet --서버에서 동작하는 작은 프로그램을 의미

// mvc 패턴: 서블릿 + jsp 혼용
// model (데이터-db): DTO (DATA TRANSFER OBJECT) class sql db
// view(html/css/js):화면표시 (js를 이용한 프론트제어)
// controller(제어-코드):dao(Database access object) db처리하는 코드들(sql)
// servlet class: request요청을 처리하고 분기하는 클래스

//3대 서버 스크립트
//jsp,php,asp

//서블릿을 등록하는 방법
//1.web.xml 
// 코드와분리가능하나
// xml및 코드가 복잡하다

//2.어노테이션 이용
//문법이나 코드가 간단하나
//코드와 분리가 불가
//자바프로젝트 빌드틀
//1.Ant:초장기 빌드 시스템, 속도느림
//2.Maven: XML기반의 빌드 시스템,spring Lagacy에서 주로 사용
//3.gradle:gradle파일 문법에 따른 빌드 시스템,안드로이드 기본 빌드툴
//sprint boot에서 주로 사용함

//test url: 8080/servelt1_hello/first?user_id=hong&user_pw=1111
@WebServlet(urlPatterns = {"/first","/first2"}) //web.xml맵핑 어노테이션
public class MyController extends HttpServlet {
	// get 요청에 응답하는 서블릿
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user_id = req.getParameter("user_id");
		String user_pw = req.getParameter("user_pw");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>"+"user_id:"+user_id+"</h3>");
		out.println("<h3>"+"user_pw:"+user_pw+"</h3>");
		out.println("</body>");
		out.println("</html>");
		
	}

	// post요청에 응답하는 서블릿
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost 호출됨");
		String user_id = req.getParameter("user_id");
		String user_pw = req.getParameter("user_pw");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>"+"user_id:"+user_id+"</h3>");
		out.println("<h3>"+"user_pw:"+user_pw+"</h3>");
		out.println("</body>");
		out.println("</html>");
	}
}
