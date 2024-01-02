package OOP_Inheritance;

import java.util.Scanner;

public class InheritanceInput2 implements inputInterface2 {

	Scanner sc = new Scanner(System.in);

	@Override
	public String inputName() {
		System.out.print("1.이름 데이터 입력 : ");
		String name = sc.next();
		return name;
	}

	@Override
	public String inputDept() {
		System.out.print("2.부서이름 데이터 입력 :");
		String deptName = sc.next();
		return deptName;
	}

	@Override
	public int salary() {
		System.out.print("3.연봉 데이터 입력 :");
		int salary = sc.nextInt();
		return salary;
	}

	@Override
	public int commition() {
		System.out.print("4.수당 데이터 입력 :");
		int commition = sc.nextInt();
		return commition;
	}
}
