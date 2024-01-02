package condition;

import java.util.Scanner;

public class ifSample7_year {

	public static void main(String[] args) {
	// 올해 년도는 홀수해인지 짝수해인지를 판별하여 구하여 출력해 보세요.
		
		int maxValue = 0, minValue = 0; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("홀짝 대상연도를 입력해 주세요."); 
		int year = sc.nextInt();
		
		if(year % 2 == 0) {
			System.out.println("해당 연도는 짝수해 입니다.");
		}else {
			System.out.println("해당 연도는 홀수해 입니다.");
		}
		/*
		if(year % 2 == 1) {
			System.out.println("해당 연도는 홀수해 입니다.");
		}
		*/

	}

}
