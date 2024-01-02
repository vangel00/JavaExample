package OOP_Constructor;

import java.util.Scanner;

//생성자 오버로딩?
// 메소드 이름은 같으나, 매개변수숫자가 다르거나, 자료형이 다르면 		

public class Sample2_constructor_overloading2 {

	static Scanner sc = new Scanner(System.in);

	private static int su1;
	private static int su2;

	private static double su3;
	private static double su4;

	private static int su5;
	private static double su6;

	private static double su7;
	private static int su8;

	private static int su9;
	private static int su10;

	@SuppressWarnings("static-access")
	public Sample2_constructor_overloading2(int su1, int su2) { // 생성자 메소드
		this.su1 = su1;//
		this.su2 = su2;//
	}

	public Sample2_constructor_overloading2(double su3, double su4) { // 생성자 메소드
		this.su3 = su3;//
		this.su4 = su4;//
	}

	public Sample2_constructor_overloading2(int su5, double su6) { // 생성자 메소드
		this.su5 = su5;//
		this.su6 = su6;//
	}

	public Sample2_constructor_overloading2(double su7, int su8) { // 생성자 메소드
		this.su7 = su7;//
		this.su8 = su8;//
	}

	public Sample2_constructor_overloading2(int su9, int su10, String z) { // 생성자 메소드
		this.su9 = su9;//
		this.su10 = su10;//
	}

	private static int IntoverloadingInputXY() {
		System.out.println("1.연산 하고자 하는 숫자를 입력하세요.");
		int overXY = sc.nextInt();//

		return overXY;
	}

	private static double DoubleoverloadingInputXY() {
		System.out.println("2.연산 하고자 하는 숫자를 입력하세요.");
		double overXY = sc.nextDouble();//

		return overXY;
	}

	
	private static void printOutput(String select) {

		System.out.println("출력을 선택하세요.");
		System.out.println("---------------");
		System.out.println("1.덧셈 출력");
		System.out.println("2.뺄셈 출력");
		System.out.println("3.곱셈 출력");
		System.out.println("4.나눗셈(/) 출력");
		System.out.println("5.나눗셈(%) 출력");
		System.out.println("6.프로그램 종료");
		System.out.println("---------------");

		switch (select) {

		case "1":
			int adder = su1 + su2;
			System.out.println("1.Add(): " + adder);//
			break;
		case "2":
			double suber = su3 - su4;
			System.out.println("2.Suber(): " + suber);//
			break;
		case "3":
			double muler = su5 * su6;
			System.out.println("3.Muler(): " + muler);//
			break;
		case "4":
			double diver1 = su7 / su8;
			System.out.println("4.Diver(): " + diver1);//
			break;
		case "5":
			double diver2 = su9 / su10;
			System.out.println("5.Diver(): " + diver2);//
			break;
		default:
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		// 두 수를 입력 받아서, 생성자 오버로딩을 이용하여 가감승제산을 하고 그 결과를 출력해 보세요.

		System.out.println("int, int 형태로 연산 하고자 하는 숫자를 입력하세요.");
		int su1 = IntoverloadingInputXY();// 12
		int su2 = IntoverloadingInputXY();// 5
		Sample2_constructor_overloading2 scon1 = new Sample2_constructor_overloading2(su1, su2);

		System.out.println("double, double 형태로 연산 하고자 하는 숫자를 입력하세요.");
		double su3 = DoubleoverloadingInputXY();// 12.3
		double su4 = DoubleoverloadingInputXY();// 5.5
		Sample2_constructor_overloading2 scon2 = new Sample2_constructor_overloading2(su3, su4);

		System.out.println("int, double 형태로 연산 하고자 하는 숫자를 입력하세요.");
		int su5 = IntoverloadingInputXY();// 12
		double su6 = DoubleoverloadingInputXY();// 5.5
		Sample2_constructor_overloading2 scon3 = new Sample2_constructor_overloading2(su5, su6);

		System.out.println("double, int 형태로 연산 하고자 하는 숫자를 입력하세요.");
		double su7 = DoubleoverloadingInputXY();// 6.6
		int su8 = IntoverloadingInputXY();// 7
		Sample2_constructor_overloading2 scon4 = new Sample2_constructor_overloading2(su7, su8);

		System.out.println("int, int(double)형태로 연산 하고자 하는 숫자를 입력하세요.");
		int su9 = IntoverloadingInputXY();// 7
		// double su9 = (double)suX;

		double suY = DoubleoverloadingInputXY();// 6.6
		int su10 = (int) suY;

		String z = null;

		Sample2_constructor_overloading2 scon5 = new Sample2_constructor_overloading2(su9, su10, z);

		while (true) {
			System.out.println("출력을 선택하세요.");
			System.out.println("---------------");
			System.out.println("1.덧셈 출력");
			System.out.println("2.뺄셈 출력");
			System.out.println("3.곱셈 출력");
			System.out.println("4.나눗셈(/) 출력");
			System.out.println("5.나눗셈(%) 출력");
			System.out.println("6.프로그램 종료");
			System.out.println("---------------");

			String select = sc.next();

			printOutput(select);

			sc.nextLine();
		}

	}

}
