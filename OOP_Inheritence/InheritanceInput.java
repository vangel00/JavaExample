package OOP_Inheritance;

import java.util.Scanner;

public class InheritanceInput implements inputInterface {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public int input1() {
		System.out.print("1.데이터 입력 : ");
		int x = sc.nextInt();
		return x;
	}

	@Override
	public int input2() {
		System.out.print("2.데이터 입력 :");
		int y = sc.nextInt();
		return y;
	}
	
	
}
