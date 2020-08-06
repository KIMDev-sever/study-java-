package memberSet;

import java.io.IOException;

public class MemberMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MemberPro pro=new MemberProImpl();
		
		while(true) {
			System.out.println("1.입력 2.출력 3.수정 4.삭제 5.종료");
			int select=System.in.read()-48;
			System.in.skip(2);
			
			switch(select){
			case 1: 
				pro.input();
				break;
			case 2:
				pro.view();
				break;
			case 3:
				pro.edit();
				break;
			case 4:
				pro.delete();
				break;
			case 5:
				pro.exit();
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				break;
					
			}
		}
	}

}
