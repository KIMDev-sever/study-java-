package part01.sec01.exam02;

interface UpperCasePrintable {

}

class ClassPrinter2 {
	public static void print(Object obj) {
		String org = obj.toString();
		org = obj instanceof UpperCasePrintable ? org.toUpperCase() : org.toLowerCase();
		System.out.println(org);
	}
}

class PointOne implements UpperCasePrintable {
	private int xPos, yPos;

	public PointOne(int x, int y) {
		// TODO Auto-generated constructor stub
		xPos = x;
		yPos = y;
	}

	public String toString() {
		String posInfo = "[x:" + xPos + ",y:" + yPos + "]";
		return posInfo;
	}
}

class PointTwo {
	private int xPos, yPos;

	public PointTwo(int x, int y) {
		// TODO Auto-generated constructor stub
		xPos = x;
		yPos = y;
	}

	public String toString() {
		String posInfo = "[x:" + xPos + ",y:" + yPos + "]";
		return posInfo;
	}
}

public class InterfaceMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointOne pos1=new PointOne(1, 1);
		PointTwo pos2=new PointTwo(2, 2);
		PointOne pos3=new PointOne(3, 3);
		PointTwo pos4=new PointTwo(4, 4);
		ClassPrinter2.print(pos1);
		ClassPrinter2.print(pos2);
		ClassPrinter2.print(pos3);
		ClassPrinter2.print(pos4);
	}

}
