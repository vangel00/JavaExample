package repeat;

/* 반복문? 특정 조건을 반복적으로 실행할 때 사용합니다.
 * 1.for
 * 2.while
 * 3.do ~ while
 */
public class forSample3_gugudan {
	
	public static void main(String[] args) {
		// for statement
		// for(초기값, 조건식, 증감식) { ..... }
		
		//문제> 구구단을 출력하세요.
		/*
		 *  2 * 1 = 2 => 2가 1개 있는 거, 2
		 *  2 * 2 = 4 => 2가 2개      , 2 + 2 =4
		 *    ...
		 *  2 * 9 = 18 => 2가 9개,    , 2 +2+2+...= 18
		 *  
		 *  3 * 1 = 3
		 *  3 * 2 = 6
		 *   ...
		 *  3 * 9 = 27 
		 *  
		 *  9 * 1 = 9
		 *  9 * 2 = 18
		 *  .....
		 *  9 * 9 = 81
		 * 
		 */
		//             2 <= 9
		for(int i = 2; i <= 9; i++) { // 외부 loop => 2, 3, 4, ...9단
			
			System.out.println("------gugudan--" + i + "-----------");		
			
			//             3 <= 9
			for(int j = 1; j <= 9; j++) { // 내부 loop => 1, 2, 3, .... 9
				
				System.out.println(i + "*" + j + "=" + (i*j)); 
				//                 2    *    1    =      2
				//                 2    *    2    =      4
				//                 2    *    3    =      6
				//                 2    *    9    =     18
				
			}
			//여기에서 단이 변경되는 부분
			
		}
		
		System.out.println("------ 아래는 while의 결과 -------");
		
	// while문으로 변경하여 출력해 봅니다.
		int i = 1, sum2 = 0;
		
		while(i <= 100) {
			sum2 += i;
			i++;
		}
		System.out.println("1~100 합계: " + sum2);
		System.out.println("------ 아래는 do ~ while의 결과 -------");
	// do ~ while 변경하여 출력합니다.
	// 일단은 먼저 실행한 다음 조건을 체크하여 거짓이면 종료합니다.
		int i2 = 1, sum3 = 0;
		
		do {
			sum3 += i2;
			i2++;
			
		}while(i2 <= 100);
		System.out.println("1~100 합계: " + sum3);
	}

}
