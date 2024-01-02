import java.util.Scanner;

/* 산술 연산자: 5가지, +, - , *, /(몫) , %(나머지)
 */
public class Sample4_Operator2 { //3000번지 가정.

	public static void main(String[] args) { // 3200번지
		//Arithmetic Operation2
		// System.out: 표준 출력을 화면으로 하세요.
		// System.in: 표준 입력을 키보드로부터 입력 하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("x 값을 입력 하세요.");
		 int x = sc.nextInt();
		 System.out.println("y 값을 입력 하세요.");
		 int y = sc.nextInt();
		 
		int sum = x + y;
		short sum2 = (short) (x - y);
		int sum3 = x * y;
		float sum4 = x / y;
		double sum5 = x % y;
		
		System.out.println("덧셈: " + sum); // 120
		System.out.println("뺄셈: " + sum2);// 80
		System.out.println("곱셈: " + sum3); // 120
		System.out.println("나눗셈(몫): " + sum4);// 80
		System.out.println("나눗셈(나머지): " + sum5); // 120
		
		//관계 연산자: 결과는 참, 거짓으로 나옵니다.
		int xx = x;//100
		int yy = y;//20
		
		System.out.println(xx > yy);//Boolean값으로 결과가 나온다. True
		System.out.println(xx >= yy);// true
		System.out.println(xx < yy);// false
		System.out.println(xx <= yy);// false
		System.out.println(xx == yy);// false
		System.out.println(xx != yy);// true
		
		//논리 연산자
		boolean a = true, b= false;
		
		/*      and(&&)  or(||)  not(!)
		 * -------------------------------
		 * 0 0    0        0     0 => 1
		 * 0 1    0        1     1 => 0
		 * 1 0    0        1
		 * 1 1    1        1
		 * -------------------------------
		 */
		System.out.println(a && b);// true&&false = false
		System.out.println(a || b);// true||false = true
		System.out.println(!a);// true = false
		System.out.println(!b);// false = true
		
		boolean a2 = true, b2 = true;		
		System.out.println(a2 && b2);// true&&true = true
		System.out.println(a2 || b2);// true||true = true
		System.out.println(!a2);// true = false
		System.out.println(!b2);// true = false		
		
		boolean a3 = false, b3 = true;
		
		System.out.println(a3 && b3);// false&&true = false
		System.out.println(a3 || b3);// false||true = true
		System.out.println(!a3);// false = true
		System.out.println(!b3);// true = false			
		
		boolean a4 = false, b4 = false;
		
		System.out.println(a4 && b4);// false&&false = false
		System.out.println(a4 || b4);// false||false = false
		System.out.println(!a4);// false = true
		System.out.println(!b4);// false = true
		
	}
	
	
}



