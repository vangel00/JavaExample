package condition;

import java.util.Scanner;

public class ifSample5_sungjuk2 {

	public static void main(String[] args) {
	// 데이터를 입력 받아서, 학점을 구하여 출력해 보세요.	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력해 주세요."); 
		
		//EOF: 데이터가 없으면, 끝으면...
		while(sc.hasNextInt()) {
			int kor = sc.nextInt();
									
			if(kor <= 100 && kor >= 90) {
				System.out.println("A학점");
			}else if(kor <= 89 && kor >= 80) {
				System.out.println("B학점");
			}else if(kor <= 79 && kor >= 70) {
				System.out.println("C학점");
			}else if(kor <= 69 && kor >= 60) {
				System.out.println("D학점");
			}else if(kor <= 59 && kor >= 0) {
				System.out.println("F학점");
			}else {
				System.out.println("잘못된 데이터가 입력이 되었습니다.");
			}
		
			
			
		}
		

	}

}
