package OOP_Constructor;

import java.util.Scanner;

//생성자 오버로딩?
// 메소드 이름은 같으나, 매개변수숫자가 다르거나, 자료형이 다르면 		
		
public class Sample2_constructor_overloading {

	static Scanner sc = new Scanner(System.in);
	
	@SuppressWarnings("unused")
	private static String name;// null => 홍길동
	@SuppressWarnings("unused")
	private static int age;// 0 =>  50
	
	@SuppressWarnings("static-access")
	public Sample2_constructor_overloading(String name) { //생성자 메소드
		this.name = name;// 
	}
	
	public Sample2_constructor_overloading(int age) { //생성자 메소드
		this.age = age;// 5
	}
	
	private static String nameInput() {		
		System.out.println("이름을 입력하세요.");
		String name = sc.next();// 홍길동
		
		return name;
	}
	private static int ageInput() {
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();// 50
		
		return age;
	}
	
	private static void printNameage() {
				
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "세 입니다.");// 
	}
	
	
	public static void main(String[] args) {
		// 이름과 나이를 입력하여, 생성자 오버로딩을 이용한 저장과 그 결과를 출력해 보세요. 
		
		String name = nameInput();// 홍길동
		int age = ageInput();// 50
	
		Sample2_constructor_overloading scon1 = new Sample2_constructor_overloading(name);
		
		Sample2_constructor_overloading scon2 = new Sample2_constructor_overloading(age);
		
		printNameage();	

	}
	

	
}
