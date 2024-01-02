package condition;

import java.util.Scanner;

public class ifSample6_maxminvalue {

	public static void main(String[] args) {
	// 두개의 데이터를 입력 받아서, 최대값과 최소값을 구하여 출력해 보세요.	
		int maxValue, minValue;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해 주세요."); 
		int x = sc.nextInt();
		System.out.println("두번째 숫자를 입력해 주세요.");
		int xx = sc.nextInt();
		
		if(x > xx) {
			maxValue = x;
			minValue = xx;
		}else {
			maxValue = xx;
			minValue = x;
		}
		System.out.println("maxVlaue: " + maxValue);
		System.out.println("minValue: " + minValue); 

	}

}
