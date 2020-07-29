package sec07_user_define_exception;

//사용자 정의 예외
public class BalnceInsufficientException extends Exception {
	
	public BalnceInsufficientException() {
		// TODO Auto-generated constructor stub
	}
	
	public BalnceInsufficientException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
