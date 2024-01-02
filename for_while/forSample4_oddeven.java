package repeat;

/* 반복문? 특정 조건을 반복적으로 실행할 때 사용합니다.
 * 1.for
 * 2.while
 * 3.do ~ while
 */
public class forSample4_oddeven {
	
	public static void main(String[] args) {
				
	//문제> 1~100사이에 숫자 중에서 홀수의 합계를 구하여 출력하세요.
		int sum = 0;
		
		//방법1.
		//             1 <= 100
		for(int i = 1; i <= 100; i++) { 
			
			if(i % 2 == 1) { //odd, 홀수이면
				sum += i;	//누적 		
			}
		}		
		System.out.println(sum); // 2500
			
		System.out.println("------ 아래는 continue의 결과 -------");
		
		//방법2.
		//continue: 건너뛰기, skip, 다음으로, 다음 데이터로.....
		int sum2 =0;
		
		for(int i = 1; i <= 100; i++) { 
			
			if(i % 2 == 0) { //even, 짝수이면
				continue;
			}
			sum2 += i;//누적 	
		}		
		System.out.println(sum2); // 2500
			
	} // main end
} //class end
