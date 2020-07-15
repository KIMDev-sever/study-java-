package part01.sec01.exam02;

public class SubscriberInfo {
	String name, id, password;
	String phoneNo, address;

	SubscriberInfo(String name, String id, String password) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.password = password;
	}

	SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	void changePassWord(String password) {
		this.password = password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
