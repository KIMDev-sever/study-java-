package servlet2_Dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jrockit.jfr.RequestDelegate;

@WebServlet(urlPatterns = {"/","/disp"})
public class MyController extends HttpServlet {
	//1단계 get요청
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.processRequest(req, resp);
	}
	//1단계 post요청
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.processRequest(req, resp);
	}
	//2단계 요청 처리
	private void processRequest(HttpServletRequest request, HttpServletResponse response) {
		//get params
		String command= request.getParameter("command");
		Object resultobject=null;
		if(command ==null) {
			resultobject="명령이없다";
		}else if(command.equals("hello")) {
			resultobject ="안녕";
		}else if(command.equals("study")) {
			resultobject="공부하자";
		}else {
			resultobject="명령이없다";
		}
		
		// 리퀘스트나 세션에 저장
		request.setAttribute("result", resultobject);
		
		//5 -jsp뷰에 결과를 넘김 디스패치
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("/view.jsp");
		
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
