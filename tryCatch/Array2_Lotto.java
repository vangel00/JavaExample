package ArraySample;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Array2_Lotto {
	
	public static void main(String[] args) {
	/* 난수를 발생하여 로또 복권을 추첨합니다.
	 * 중복을 제거하여 로또를 출력해 보세요. 
	 */		
		
		Random rand = new Random();//난수 발생 클래스
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			try {
			
			System.out.println("로또 자릿수를 입력해 주세요.");
			int n = sc.nextInt();// 6
			
			int lotto[] = new int[n];//난수 저장 배열
			
			System.out.println("LottoCount = ");//로또 발행 횟수
			int lottoCnt = sc.nextInt();// 4
			
			for(int cnt=1; cnt <= lottoCnt; cnt++) {			
				
				loop_lotte: for(int idx=0; idx < lotto.length; idx++) {
					
					int lot = rand.nextInt(45) + 1;//lotto number(1~45)
					//int lot = rand.nextInt(45);//0~44 [X]
					
					//중복확인
					for(int i=0; i < idx; i++) {
						
						if(lot == lotto[i]) {
							idx--;
							continue loop_lotte;
						}
					}//i end
					lotto[idx] = lot;
				}//idx end
				
				Arrays.sort(lotto);// lotto 오름차순 정렬
				
				System.out.println(cnt + "로또 발행 번호");
				
				for(int i=0; i< lotto.length; i++) {
					System.out.print(lotto[i] + ", ");
				}
				System.out.println();
			}
			}catch(InputMismatchException e) {
				//e.printStackTrace();
				System.out.println("로도 자릿수와 카운터(복권발행횟수)는 정수형으로 입력해 주세요.");
			}
			sc.nextLine();
			
		}//while loop end
		
			
		
	}//main end

}//class end
