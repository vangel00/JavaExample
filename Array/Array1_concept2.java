package ArraySample;

import java.util.Scanner;

/* Array란? 
 * 차원
 * 주소값
 * 면, 행, 열
 * 1차원배열: 행과 열이 동일시 됩니다.
 * int[] a = new int[5]; 1차원 배열의 선언
 * 
 * 2차원 배열: 행(row): x축, 열(column): y축 
 * int[][] a = new int[][3];
 * 
 * 3차원 배열: 면, 행, 열
 * int[][][] a = int[][][]
 * 
 */
public class Array1_concept2 {
	
	public static void main(String[] args) {
	//배열에 사용할 임의의 데이터를 n개 입력하여 그 배열의 데이터의 
	// 합계와 평균을 구하여 출력해 봅니다.
		int jumsu = 0;//메모리상에서 jumsu라는 변수를 사용하여 0으로 초기화, 지역변수
		int sum = 0;
		
		boolean run = true;
		
		while(run) {
			Scanner sc = new Scanner(System.in);
			System.out.println("입력할 데이터의 갯수를 입력해 주세요.");
			int n = sc.nextInt();// 10
			
			int[] scores = new int[n];// [0] ~ [9]
			
			System.out.println("데이터 " + n + "개를 입력해 주세요.");
			
			//반복문:    초기값    조건식           증가값
			for(int i=0; i < scores.length; i++) {			
				jumsu = sc.nextInt();
				
				//scores[0]= 100, scores[1]=98, [2]=80,  .....
				scores[i] = jumsu;
				sum += scores[i];//합계 구하기
			}
			double aver = sum / scores.length;
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %5.2f", aver);
			System.out.println();
			
			System.out.println("찾을 점수 데이터를 입력하세요.");
			int searchJumsu = sc.nextInt();
			
			for(int i=0; i < scores.length; i++) {
				
				if(scores[i] == searchJumsu) {
					System.out.println(scores[i] + "는 index로 " + i +"에 저장되어 있습니다.");
				}
			}
			
			if(run) {
				System.out.println("data continue search?(yes/no)");
				
				String conti = sc.next();
				
				if(conti.equals("yes")) {
					continue;
				}else {
					break;
				}
			}	
			
			
		}//while loop end		
		
		
	}//main end

}//class end
