package part01.sec01.exam01;

public class StringBuilderExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * 문자열에 관련된 클래스(StringBuilder)
		 * append(String str):문자열뒤에 str을 덧붙임
		 * insert(int offset,String str):문자열의 offset위치에 str삽입
		 * delete(int start,int end): strat부터 end-1까지의 부분 문자열 삭제
		 * deleteCharAt(int index):index위치에 있는 하나의 문자를삭제
		 */
		
		StringBuilder builder=new StringBuilder();
		builder.append("aaa");
		builder.insert(1,"asdasd");
		builder.delete(0, 1);
		builder.deleteCharAt(5);
		System.out.println(builder);
	}

}
