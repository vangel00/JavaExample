package repeat;

import java.util.Scanner;

/* 반복문? 특정 조건을 반복적으로 실행할 때 사용합니다.
 * 1.for
 * 2.while
 * 3.do ~ while
 */
public class forSample6_startend {
	
	public static void main(String[] args) { //3000
				
	//문제> 시작 숫자를 입력하고, 끝나는 숫자를 입력하여 누적된 합계를 구하여 출력하세요.
	// 1.for
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자를 입력해 주세요.");
		int x = sc.nextInt();
		System.out.println("마지막 숫자를 입력해 주세요.");
		int y = sc.nextInt();
		
		for(int i=x; i<=y; i++) {
			
				sum+=i;
		}
		System.out.println(sum); 
		System.out.println("------ 아래는 while의 결과 -------");
		
		//방법2. while
				
		Scanner sc2 = new Scanner(System.in);
		System.out.println("시작 숫자를 입력해 주세요.");
		int xx = sc2.nextInt();
		System.out.println("마지막 숫자를 입력해 주세요.");
		int yy = sc2.nextInt();
		
		int sum2 = 0;
		
		while(xx<=yy) {
			sum2+=xx;
			xx++;
		}
		System.out.println(sum2);
		System.out.println("------ 아래는 do ~ while의 결과 -------");
		  
		 //방법3. do ~ while
		Scanner sc3 = new Scanner(System.in);
		System.out.println("시작 숫자를 입력해 주세요.");
		int xxx = sc3.nextInt();
		System.out.println("마지막 숫자를 입력해 주세요.");
		int yyy = sc3.nextInt();
		
		int sum3 = 0;
		do {
			sum3+=xxx;
				xxx++;			
						
		}while(xxx<=yyy);
		System.out.println(sum3);
	
	} // main end
} //class end
