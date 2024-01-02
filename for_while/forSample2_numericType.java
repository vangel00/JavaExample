package repeat;

/* 반복문? 특정 조건을 반복적으로 실행할 때 사용합니다.
 * 1.for
 * 2.while
 * 3.do ~ while
 */
public class forSample2_numericType {
	
	public static void main(String[] args) {
		// for statement
		// for(초기값, 조건식, 증감식) { ..... }
		
		//문제> 1~ 100 사이의 정수의 합계를 구하여 출력하세요.
		int sum =0;
		
		for(int i=0; i <= 100; i++) {
			sum += i;			
		}
		System.out.println("1~100 합계: " + sum);
		System.out.println("------ 아래는 while의 결과 -------");
		
	// while문으로 변경하여 출력해 봅니다.
		int i = 1, sum2 = 0;
		
		while(i <= 100) {
			sum2 += i;
			i++;
		}
		System.out.println("1~100 합계: " + sum);
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
