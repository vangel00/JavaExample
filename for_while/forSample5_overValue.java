package repeat;

/* 반복문? 특정 조건을 반복적으로 실행할 때 사용합니다.
 * 1.for
 * 2.while
 * 3.do ~ while
 */
public class forSample5_overValue {
	
	public static void main(String[] args) { //3000
				
	//문제> 1부터 시작하여 누적된 합계가 3000이 넘는 순간에 값이 얼마인지를 구하여 출력하세요.
		
		int sum = 0;// 3010
		int i = 1;
		
		//방법1.
		//             
		for(    ;        ; i++) { 
			
			sum += i;	//누적 		
			
			if(sum >=3000) { 
				System.out.println(i + ", " + sum); // 77, 3003
				break;
			}
		}		
		System.out.println(i + ", " + sum); // 77, 3003
			
		System.out.println("------ 아래는 while의 결과 -------");
		
		//방법2. while
				
		  int sum2 = 0;// 3020
		  int i2 = 0;
		  
		  //     0   <= 3000
		  while(sum2 <= 3000) {
			  i2++;
			  sum2 += i2;//누적 
			  
			  } 
		  System.out.println(i2 + ", " + sum2); // 
		  System.out.println("------ 아래는 do ~ while의 결과 -------");
		  
		 //방법3. do ~ while
		  int sum3 = 0;// 3030
		  int i3 = 0;
		  
		  do {
			  i3++;
			  sum3 += i3;//누적 
			  
		  }while(sum3 <= 3000);
		  System.out.println(i3 + ", " + sum3); // 
		 			
	} // main end
} //class end
