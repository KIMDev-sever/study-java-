package servlet3_LoginJoinDB;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//오버라이드와 오버로딩의 차이점
// 상속과 다형성에대해서
/*
 * 
 */
// 가상함수 (virtual method)란  함수 선언만 있고 본체 코드가 없는 함수
/*
 * 가상함수가 들어간곳
 * 
 * 1.추상클래스
 * 일반함수도 들어갈수있음
 * abstract 키워드를 반드시써야됨
 * 다중상속이 안됨
 *
 * 2.인터페이스
 * 가상함수만 들어갈수있음
 * abstract 키워드를 안써도됨
 * 다중상속이됨
 */

public interface Action {
	
	// 가상함수이름 execute
	// 리턴타입  ActionForward객체
	// 예외처리 throws;
	public ActionForward execute(HttpServletRequest request, HttpServletResponse res) throws Exception;
}
