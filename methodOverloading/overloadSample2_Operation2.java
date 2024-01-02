package methodOverloading;

import java.util.Scanner;

public class overloadSample2_Operation2 {
 
	static Scanner sc = new Scanner(System.in);
	
	private static void calculator() {
		System.out.println("정수형 데이터를 입력하시오.");
			int x = sc.nextInt();
			int y = sc.nextInt();
		    int sum = x + y;
		    System.out.println("두 수의 합계: " +sum);//
	}
	
	private static void calculator(double x, double y) {
			double sum = x - y;
		System.out.println("두 수의 차이: " + sum);//		
	}
	
	private static void calculator(int x3, double y3) {
			double sum = x3 % y3;
		System.out.println("두 수의 나눗셈(%): " + sum);//		
	}
	
	public static void main(String[] args) { 
	/* 메뉴를 선택하여
	 *  1.덧셈
	 *  2.뺄셈
	 *  3.나눗셈(나머지)
	 *  4.종료
	 *  
	 * 2개는 정수형 데이터 처리
	 * 2개는 실수형 데이터 처리
	 * 1개는 정수형 데이터, 1개는 실수형 데이처 처리
	 */
		
		while(true) {
		System.out.println("==============");
		System.out.println("1.덧셈         ");
		System.out.println("2.뺄셈         ");
		System.out.println("3.나눗셈(나머지) ");
		System.out.println("4.종료         "); 
		System.out.println("==============");
		System.out.println("연산할 메뉴를 선택해 주세요.");
	
		String su = sc.next();//
	
		switch(su) {
		case "1":  calculator(); break;
		
		case "2": System.out.println("실수형 데이터를 입력하시오.");
					double x = sc.nextDouble();
					double y = sc.nextDouble();  
					calculator(x, y);
					break;
		case "3": System.out.println("1:정수형, 2:실수형 데이터를 입력하시오.");
					int x3 = sc.nextInt();
					double y3 = sc.nextDouble();  
					calculator(x3, y3);
					break;
		default: System.exit(0);				
		
		}
		
		}
	}



	
}
