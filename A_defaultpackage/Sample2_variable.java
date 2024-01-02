import java.util.Scanner;

/*
 * 변수: variable: 데이터 저장 공간
 *  
 */
public class Sample2_variable {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("1.정수형 데이터를 입력하세요.");
		/* int: 정수형으로
		 * x : x라는 변수에 저장
		 * int => Integer의 약어.
		 */
		int x = sc.nextInt();
		System.out.println("2.정수형 데이터를 입력하세요.");
		int y = sc.nextInt();
		
		int sum = x + y;
		System.out.println("합계: " + sum);// ?
		
	} 
	
	
}

