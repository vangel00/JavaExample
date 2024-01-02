import java.util.Scanner;

public class Sample4_Operator7 { 

	public static void main(String[] args) { 
		// 삼항 연산자 :  x = (조건식) ? 참(조건식, 수식) : 거짓(조건식, 수식)
		int x = 1;
		
		String su = (x == 1)? "참":"거짓";
		System.out.println(su);//참
		
		Scanner sc = new Scanner(System.in);
		System.out.println("남자:1, 여자:2를 입력하세요.");
		int x2 = sc.nextInt();
		
		System.out.println((x2 == 1) ? "남자입니다.": 
						   (x2 == 2) ? "여자 입니다.": "오류 입니다.");
				
	//문제> 어떤 숫자를 입력 받아서, 홀수인지, 짝수인지를 판별하여 출력하세요.
		
		System.out.println("홀수:1, 짝수:0 입력하세요.");
		int x3 = sc.nextInt();
		
		int c = x3 % 2;
		System.out.println((c == 0) ? "짝수 입니다.": 
						   (c == 1) ? "홀수 입니다.": "오류 입니다.");
		
	//문제> 어떤 숫자를 입력 받아서, 배수인지, 아닌지를 판별하여 출력하세요.
		
				System.out.println("임의수를 입력하세요.");
				int x4 = sc.nextInt();
				
				int c2 = x4 % 3;
				
				System.out.println((c2 == 0) ? "3의 배수 입니다.": "배수가 아닙니다.");
				
		sc.close();
		
	}
	
	
}



