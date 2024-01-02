package condition;

import java.util.Scanner;

public class ifSample5_sungjuk {

	public static void main(String[] args) {
	// 데이터를 입력 받아서, 학점을 구하여 출력해 보세요.	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력해 주세요."); 
		
		//EOF: 데이터가 없으면, 끝으면...
		while(sc.hasNextInt()) {
			int kor = sc.nextInt();
						
			// sw = code의 재사용성 = 소프트웨어 공학 측면에서  
			/*
			if(kor >= 90) {
				System.out.println("A학점");
			}else if(kor >= 80) {
				System.out.println("B학점");
			}else if(kor >= 70) {
				System.out.println("C학점");
			}else if(kor >= 60) {
				System.out.println("D학점");
			}else{
				System.out.println("F학점");
			}	
		 */
			
			switch(kor/10) {  
			case 9: System.out.println("A학점"); 
				 	break;
			case 8: System.out.println("B학점"); 
					break;			
			case 7:	System.out.println("C학점"); 
					break;
			case 6: System.out.println("D학점"); 
					break;
					
			default:
				System.out.println("F학점"); 
			}
			
			
			
		}
		

	}

}
