package OOP_Constructor;

import java.util.Scanner;

public class Number {

	static Scanner sc = new Scanner(System.in);
	
	private static int x;//0 => 300
	private static int y;//0 =>  5
	
	//                          300,   5
	public Number(int x, int y) { //생성자 메소드
		this.x = x;// 300
		this.y = y;// 5
	}
	private static int dataInput1() {		
		System.out.println("첫번째 숫자를 입력하세요.");
		int x = sc.nextInt();// 300
		
		return x;
	}
	private static int dataInput2() {
		System.out.println("두번째 숫자를 입력하세요.");
		int y = sc.nextInt();// 5
		
		return y;
	}
	
	private static int getNumber1() {		
		return x;
	}
	
	private static int getNumber2() {		
		return y;
	}
	
	public static void main(String[] args) {
		// 임의의 두 수를 입력 받아서, Number클래스에 생성자를 이용하여 데이터를 전달하여 저장하고, 반환하는 결과를 출력하는데
		// getNumber()를 이용하여 출력해 보세요. 
		
		int x = dataInput1();// x => 300
		int y = dataInput2();// y => 5
	
		//                     300, 5
		Number scon = new Number(x, y);
		
		int xx = getNumber1();
		System.out.println(xx);// 300
		
		int yy = getNumber2();
		System.out.println(yy);// 5

	}
	

	
}
