package part01.sec01.exam02;

interface PersonalNumberStorage {
	public abstract void addPersonalInfo(String name, String num);

	public abstract String searchName(String perNum);
}

class PersonalNumInfo implements PersonalNumberStorage {
	String name;
	String number;

	public PersonalNumInfo(String name, String num) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.number = num;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	@Override
	public String searchName(String perNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPersonalInfo(String name, String num) {
		// TODO Auto-generated method stub

	}

}

class PersonalNumberStorageImpl implements PersonalNumberStorage {
	PersonalNumInfo[] perArr;
	int numofPerInfo;

	public PersonalNumberStorageImpl(int sz) {
		// TODO Auto-generated constructor stub
		perArr = new PersonalNumInfo[sz];
		numofPerInfo = 0;
	}

	@Override
	public void addPersonalInfo(String name, String num) {
		// TODO Auto-generated method stub
		perArr[numofPerInfo++] = new PersonalNumInfo(name, num);

	}

	@Override
	public String searchName(String perNum) {
		// TODO Auto-generated method stub
		for (int i = 0; i < perArr.length; i++) {
			if (perArr[i].getNumber().compareTo(perNum) == 0) {
				return perArr[i].getName();
			}
		}
		return null;
	}
}

public class AbstractInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(10);
		storage.addPersonalInfo("홍길동", "111111-1111111");
		storage.addPersonalInfo("장신길", "222222-2222222");
		System.out.println(storage.searchName("111111-1111111"));
		System.out.println(storage.searchName("222222-2222222"));

	}

}
