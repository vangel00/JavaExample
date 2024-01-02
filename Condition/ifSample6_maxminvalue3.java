package condition;

import java.util.Scanner;

public class ifSample6_maxminvalue3 {

	public static void main(String[] args) {
	// 3개의 데이터를 입력 받아서, 최대값과 최소값을 구하여 출력해 보세요.	
		int maxValue = 0, minValue = 0; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요."); 
		int x1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요.");
		int x2 = sc.nextInt();
		System.out.println("세번째 숫자를 입력해 주세요.");
		int x3 = sc.nextInt();
		
		//삼항 연산자
		// String x = (조건식)? 참:거짓
		
		maxValue = (x1 > x2 && x1 > x3)? x1:
					(x2 > x1 && x2 > x3)? x2:x3;
		
		minValue = (x1 < x2 && x1 < x3)? x1:
			(x2 < x1 && x2 < x3)? x2:x3;
		
		System.out.println("maxValue: " + maxValue);
		System.out.println("minValue: " + minValue); 

	}

}
