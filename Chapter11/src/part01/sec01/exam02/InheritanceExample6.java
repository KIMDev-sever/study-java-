package part01.sec01.exam02;

abstract class MessageSender {
	String title;
	String senderName;

	MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}

	abstract void sendMessage(String recipient);
}

/*
 * abstract 메서드가 없어도 인스턴스 생성을 원하지 않으면 클래스를 abstract로 선언 할 수 있다. 그러나 abstract메서드가
 * 하나라도 있으면 그클래스는 반드시 abstract로 선언해야한다.
 */
class EmailSender extends MessageSender {
	String senderAddr;
	String emailBody;

	EmailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
		// TODO Auto-generated constructor stub
	}

	@Override
	void sendMessage(String recipient) {
		// TODO Auto-generated method stub
		System.out.println("---------------------");
		System.out.println("제목:" + title);
		System.out.println("보내는사람:" + senderName + " " + senderAddr);
		System.out.println("받는사람:" + recipient);
		System.out.println("내용:" + emailBody);
	}
}

class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;

	SMSSender(String title, String senderName, String returnPhoneNo, String message) {
		super(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
		// TODO Auto-generated constructor stub
	}

	@Override
	void sendMessage(String recipient) {
		// TODO Auto-generated method stub
		System.out.println("---------------------");
		System.out.println("제목:" + title);
		System.out.println("보내는사람:" + senderName);
		System.out.println("전화번호:" + recipient);
		System.out.println("회신 전화번호:" + returnPhoneNo);
		System.out.println("메세지 내용:" + message);
	}
}

public class InheritanceExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailSender emailSender=new EmailSender("생ㅊㅋ", "고객센터", "admin@dukeeshop.com", "구라야");
		SMSSender smsSender=new SMSSender("축하합니다 당첨되셨습니다.", "고객센터", "123-1234", "힝 속았지");
		emailSender.sendMessage("aa");
		smsSender.sendMessage("aa");
		}

}
