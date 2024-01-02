package condition;

import java.util.Scanner;

public class ifSample8_baesu {

	public static void main(String[] args) {
	// 임의의 수를 입력 받아서, 그 수가 어떤 배수(3, 5, 7, 9)인지를 판별하여 출력해 보세요.
		
		int maxValue = 0, minValue = 0; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 수를 입력해 주세요."); 
		int su = sc.nextInt();
		
		if(su % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		}
		if(su % 5 == 0) {
			System.out.println("5의 배수 입니다.");
		}
		if(su % 7 == 0) {
			System.out.println("7의 배수 입니다.");
		}
		if(su % 9 == 0) {
			System.out.println("9의 배수 입니다.");
		}
		
		if(su % 3 != 0 && su % 5 != 0 && su % 7 != 0 && su % 9 != 0) {
			System.out.println("3,5,7,9의 배수가 아닙니다.");
		}

	}

}
