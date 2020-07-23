package part01.sec01.exam02;

class ClassPrinter {
	public static void print(Point3 p) {
		System.out.println(p.toString());
	}
}

class Point3 {
	private int xPos, yPos;

	public Point3(int x, int y) {
		// TODO Auto-generated constructor stub
		xPos = x;
		yPos = y;
	}

	public String toString() {
		String posInfo = "[x:" + xPos + ",y:" + yPos + "]";
		return posInfo;
	}
	
}

public class ImplObjectPrintln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3 pos1=new Point3(1, 2);
		Point3 pos2=new Point3(5, 9);
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
	}

}
