package OOP_Inheritance;

import java.util.Scanner;

public class Sample1_Inheritance3 {

	public static void main(String[] args)   {
		// 문제> 데이터를 입력 받아서, 가감승제산을 처리하되, 상속을 이용하여 처리하고, 출력해 보세요.
		// 애프리케이션 요구사항 => 분석
		
		/* 애플리케이션 설계
		 * ----------------
		 * main class: Sample1_Inheritance3
		 *   
		 * sub class
		 *  1.interface: 가감승제산 5가지 
		 *   -데이터 입력: inputInterface(x, y), input1(), input2();
		 *   -덧셈 인터페이스: addInterface, public abstract void adder(int x, int y);
		 *   -뺄셈 인터페이스: suberInterface, suber(int x, int y)
		 *   -곱셈 인터페이스: mulerInterface, muler(int x, int y)
		 *   -나눗셈 인터페이스(/): divierInterface1, divider1(int x, int y)
		 *   -나눗셈 인터페이스(%): divierInterface2, divider2(int x, int y)
		 *   
		 *  2.sub class: InheritanceInput
		 *    -  InheritanceAdder
		 *    -  InheritanceSuber
		 *    -  InheritanceMuler 
		 *    -  InheritanceDivier1
		 *    -  Inheritancedivier2
		 *    	
		 *  3.인터페이스가 인터페이스에게 상속: 하나의 프로젝트 클래스에서 처리하는 경우에 사용
		 *  
		 *  4.logic 작성
		 */
		
		InheritanceInput it3 = new InheritanceInput(); 
			int x = it3.input1();
			int y = it3.input2();
			
		InheritanceAdder itadd = new InheritanceAdder();
			itadd.adder(x, y);
			
		InheritanceSuber itsub = new InheritanceSuber();
			itsub.suber(x, y);
	}	

}
