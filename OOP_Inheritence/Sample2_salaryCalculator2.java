package OOP_Inheritance;

import java.util.Scanner;

interface calcul {
	// 
	public final String message = "안녕하세요? 반갑습니다.";
	public abstract void operation();

}

class MoneyTotal {

	int dad;//0 => 2000
	int mom;//0 => 3000

	public MoneyTotal(int dad, int mom) {
		this.dad = dad;
		this.mom = mom;
	}
}

class Money extends MoneyTotal implements calcul {

	public Money(int dad, int mom) {
		super(dad, mom);
	}

	@Override
	public void operation() {
		int total = dad + mom;

		System.out.println(message);//
		System.out.println("-------------------");
		System.out.println("아빠 용돈: " + dad);
		System.out.println("엄마 용돈: " + mom);
		System.out.println("용돈 합계: " + total);
		System.out.println("-------------------");
	}

}

public class Sample2_salaryCalculator2 {

	public static void main(String[] args) {
		/*
		 * 문제> 아빠가 2000원을 주셨습니다. 엄마는 3000원을 주셨습니다. 받은 금액은 얼마일까요?
		 *  - 상속 이용, 생성자 이용, 추상 메소드 이용
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("아빠의 용돈: ");
		int dad = sc.nextInt();
		System.out.println("엄마의 용돈: ");
		int mom = sc.nextInt();

		Money ss2 = new Money(dad, mom);
		ss2.operation();
		
	}

}
