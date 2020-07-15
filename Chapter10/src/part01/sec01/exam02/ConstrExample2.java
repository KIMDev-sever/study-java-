package part01.sec01.exam02;

public class ConstrExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubscriberInfo obj1 = new SubscriberInfo("연흥부", "poorman", "zebi");
		SubscriberInfo obj2 = new SubscriberInfo("연놀부", "richman", "money", "02-000-0000", "타워팰리스");
//		obj1.setPhoneNo("");
//		obj1.address = "";
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
	}

	public static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println(obj.name + " " + obj.id + " " + obj.password + " " + obj.phoneNo + " " + obj.address);
	}
}
