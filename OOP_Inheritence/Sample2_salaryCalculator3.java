package OOP_Inheritance;

import java.util.Scanner;

abstract class BookStore {
	// 추상 메소드 선언 또는 설계
	public abstract void Calculator(int bookvalue, int amount);

	public abstract void Process();

	public abstract void Process2();

	public abstract void EndPrice();
}

class Money2 extends BookStore {

	//도서 금액
	private int bookvalue;//
	
	//구매 금액
	private int amount;// 
	
	// 받을 금액
	private int resultbookvalue;//
		
	@Override
	public void Calculator(int bookvalue, int amount) {
		this.bookvalue = bookvalue;	
		this.amount = amount;
	}

	@Override
	public void Process() { // 구매금액 - (도서 가격 - 3000)
		resultbookvalue = amount - (this.bookvalue - 3000);		
	}

	@Override
	public void Process2() {
		resultbookvalue = amount - (this.bookvalue - 4000);			
	}

	@Override
	public void EndPrice() {
		System.out.println("-------------------");
		System.out.println("도서 금액: " + bookvalue);
		System.out.println("결재 금액: " + amount);		
		System.out.println("-------------------");
		System.out.println("최종 받을 금액 : " + resultbookvalue); 			
	}

}

public class Sample2_salaryCalculator3 {

	public static void main(String[] args) {
		/*
		 * 문제> 서점에서 학부모에게는 3000원을 할인합니다. 
		 * 학생에게는 4000원을 할인해 줍니다. 
		 * 최종 금액은 얼마일까요? 
		 * - 상속 이용, 생성자 이용, 추상 메소드 이용
		 */
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("도서 가격을 입력하세요.");
			int bookvalue = sc.nextInt();// 
			System.out.println("구매금액을 입력하세요.");
			int amount = sc.nextInt();//
			System.out.println("부모님(1)인지, 학생(2)인지를 입력하세요.");
			int stuvalue = sc.nextInt();//

			if (stuvalue == 1) { // 부모님
				Money2 c3 = new Money2();
				c3.Calculator(bookvalue, amount);// 도서가격과 구매금액
				c3.Process();// 연산 처리
				c3.EndPrice();
			} else if (stuvalue == 2) { // 학생
				Money2 c3 = new Money2();
				c3.Calculator(bookvalue, amount);// 
				c3.Process2();
				c3.EndPrice();
			}
			System.out.println();
		}

	}

}
