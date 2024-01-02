package Condition;

import java.util.Scanner;

public class ifSample4_switchcase {

	public static void main(String[] args) {
	// 데이터를 입력 받아서, 남성인지, 여성인지를 판별하는데, 
	// 19900년대 사람과 2000년대 사람을 구분하여 출력해 보세요.	
		Scanner sc = new Scanner(System.in);
		System.out.println("1,3:남성, 2,4:여성을 입력해 주세요."); 
		
		//EOF: 데이터가 없으면, 끝으면...
		while(sc.hasNextInt()) {
			System.out.println("1,3:남성, 2,4:여성을 입력해 주세요."); 
			int x = sc.nextInt();
			
			//1900년대 사람 구분: 1, 2 2000: 3, 4
			//if문을 switch~case로 변환하여 작성합니다.
			
			/*
			if(x == 1 || x== 3) {
				System.out.println("남성");
			}else if(x == 2 || x == 4) {
				System.out.println("여성");
			}else {
				System.out.println("잘못된 데이터 입력 입니다.");
			}	
		 */
			switch(x) {  // 5
			case 1:
			case 3:System.out.println("남성");
					break;
			
			case 2:		
			case 4:System.out.println("여성");
					break;
			default:
				System.out.println("잘못된 데이터 입력 입니다.");
			}
			
			
			
		}
		

	}

}
