package repeat;

/* 반복문? 특정 조건을 반복적으로 실행할 때 사용합니다.
 * 1.for
 * 2.while
 * 3.do ~ while
 */
public class forSample1_String {

	public static void main(String[] args) {
		// for statement
		// for(초기값, 조건식, 증감식) { ..... }
		
		//문제> "이젠 컴퓨터 아카데미 학원" 이라는 문자열을 5번 반복 출력하세요.
		
		for(int i=0; i < 5; i++) {
			System.out.println("이젠 컴퓨터 아카데미 학원");
		}
		System.out.println("------ 아래는 while의 결과 -------");
		
	// while문으로 변경하여 출력해 봅니다.
		int count  =0;
		
		while(count < 5) {
			System.out.println("이젠 컴퓨터 아카데미 학원");
			count++;
		}
		System.out.println("------ 아래는 do ~ while의 결과 -------");
	// do ~ while 변경하여 출력합니다.
	// 일단은 먼저 실행한 다음 조건을 체크하여 거짓이면 종료합니다.
		int count2 =0;
		
		do {
			System.out.println("이젠 컴퓨터 아카데미 학원");
			count2++;
			
		}while(count2 < 5);
		
	}

}
