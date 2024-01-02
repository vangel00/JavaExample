package methodSample;

import java.util.Scanner;

//문제> 두 수를 입력 받아서, 가감승제산 5가지(+, -, *, /, %)를 하여 출력하세요. 
	/* 입력: input1(), x, input2(), y
	 * 덧셈: adder(), 전달인자 변수(x, y), 매개변수(x1, y1), 반환값(sum1), return O
	 * 뺄셈: suber(),l 전달인자 변수(x, y), 매개변수(x2, y2), 반환값(sum2), return X
	 * 곱셈: muler(), 전달인자 변수(x, y), 매개변수(x3, y3), 반환값(sum3), return O
	 * 나눗셈(몫): diver(), 전달인자 변수(x, y), 매개변수(x4, y4), 반환값(sum4), return X
	 * 나눗셈(나머지):	diver2(), 전달인자 변수(x, y)=> [X], 매개변수(x5, y5), 반환값(sum5), return X
	 * output()
	 * 
	 * 프로그래밍 단계
	 * 1.요구사항 확인
	 * 2.애플리케이션 분석
	 * 3.애플리케이션 설계
	 * 4.애플리케이션 구현(coding)
	 * 5.애플리케이션 테스트
	 * 6.검수
	 * 7.애플리케이션 배포 : SI
	 * 8.애플리케이션 유지보수: SM
	 * 
	 */
public class methodSample2_Calculator {  

	private static void diver2() {
		
		int x5 = input1();
		int y5 = input2();
		
		int sum5 = x5 % y5;
		
		System.out.println("diver2(): " + sum5);// 
		
	}


	private static void diver(int x4, int y4) {
		
		int sum4 = x4 / y4;
		
		System.out.println("diver(): " + sum4); //
	}
	
	private static double muler() {
		
		int x3 = input1();
		int y3 = input2();
		
		int sum3 = x3 * y3;
		
		return sum3;
		
	}

	
	private static void suber(int x2, int y2) {
		
		int sum2 = x2 - y2;
		
		System.out.println("suber(): " + sum2); 
	}
	
	private static int adder(int x1, int y1) {
		
		int sum1 = x1 + y1;
		
		return sum1;
		
	}
	
	private static int input1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 데이터를 입력해 주세요.");
		int x = sc.nextInt(); 
		
		return x;
	}
	
	private static int input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두번째 데이터를 입력해 주세요.");
		int y = sc.nextInt();
		
		return y;
	}
	
	public static void main(String[] args) { 
	
		int x = input1(); //data input
		int y = input2();
		
		int sum1 = adder(x, y); 
		System.out.println("adder(): " + sum1);
		
		suber(x, y);  
		
		double sum3 = muler();
		System.out.println("muler(): " + sum3); 
		
		diver(x, y);
		
		diver2();
	}

	
	
	
}
