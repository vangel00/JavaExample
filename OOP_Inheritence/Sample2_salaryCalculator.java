package OOP_Inheritance;

import java.rmi.server.Operation;
import java.util.Scanner;



class Sales {
	
	//private String name;
	protected static String name;
	protected static String deptName;
	protected static int salary;
	protected static int commition; 

	public Sales(String name, String deptName, int salary, int commition) {
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
		this.commition = commition;
	}
}

class Cal extends Sales{

	public Cal() { //default Constructor
		super(name, deptName, salary, commition);
	}
	
	public void operation() {
		super.name = name;
		super.salary = salary;
		super.commition = commition;
		
		salary = salary + commition;
		System.out.println("연봉 + 수당 : " + salary);//
	}
	
	
}
	
public class Sample2_salaryCalculator {

	public static void main(String[] args)   {
		/* 문제> 이름, 부서, 연봉, 수당 데이터를 입력 받아서, 연산 처리하여 출력해 보세요.
			- 상속 이용
			- 생성자 이용
			- 추상 메소드 이용
							
		 * 애플리케이션 설계
		 * ----------------
		 * main class: Sample2_salaryCalculator
		 *   
		 * sub class
		 *  1.interface: 승산 
		 *   -데이터 입력: inputInterface2(name, dept, salary, commition), 
		 *   			inputName(), inputDept(), inputSalary(), inputCommition()
		 *       
		 *  2.sub class: InheritanceInput2
		 *    -  InheritanceAdder2
		 *        	
		 *  3.인터페이스가 인터페이스에게 상속: 하나의 프로젝트 클래스에서 처리하는 경우에 사용
		 *  
		 *  4.자료저장 클래스 별도: Sales, super 개념 도입 적용
		 *  
		 *  5.logic 작성
		 */
		
		InheritanceInput2 it3 = new InheritanceInput2(); 
			String name = it3.inputName();
			String deptName = it3.inputDept();
			int salary = it3.salary();
			int commition = it3.commition();
			
			//data storage
			Sales sal = new Sales(name, deptName, salary, commition);
			
			//data operation
			Cal cal = new Cal(); 
				cal.operation();		
	}	

}
