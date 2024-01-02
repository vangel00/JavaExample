package ArraySample;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array3_dataSortResult {
	
	public static void main(String[] args) {
	/* 임의의 수를 입력 받아서, 배열에 저장하고, 내림차순으로 정렬 합니다.
	 * 데이터>
	 * 100 300 400 200
	 * 
	 * 1회전 결과: 400 100 300 200
	 * 2회전 결과: 400 300 100 200
	 * 3회전 결과: 400 300 200 100 
	 *  
	 */		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("정렬을 원하는 데이터 배열의 크기를 입력해 주세요.");
			int n = sc.nextInt();// 6
			
			int sortData[] = new int[n];// 6: 0~5
			
			System.out.println("****** 데이터 입력 ******");
			for(int i=0; i < sortData.length; i++) {
				System.out.println((i+1) + "번째 데이터: ");
				sortData[i] = sc.nextInt();				
			}
			
			//내림차순 정렬			
			for(int i=0; i < sortData.length-1; i++) {			
				
				//          7    
				for(int j = i + 1; j < sortData.length; j++) {
					
					//      7      <      9
					if(sortData[i] < sortData[j]) {  //descending sort
							
						int temp = sortData[i];//  7 = 7
						sortData[i] = sortData[j];// 9 =  9
						sortData[j] = temp; // 7 = 7
						
						}
					}//j end
					
					System.out.println((i+1) + "번째 회전 결과는 : "); 
					
					for(int k: sortData) { // 가변 for문
					//for(int k=0; k < sortData.length; k++) {
						//System.out.print(sortData[k] + ", "); 
						System.out.print(k + ", ");
					}
					System.out.println();
					
				}//i end
								
						
			if(run) {
				System.out.println("data sort continue ?(yes/no)");
				
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
