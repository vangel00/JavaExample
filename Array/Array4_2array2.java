package ArraySample;

import java.util.Scanner;

public class Array4_2array2 {
	
	public static void main(String[] args) {
	/* 2차원 배열: 행, 열
	 * 
	 * N명의 학생이름과 점수를 입력 받아서, 총점, 평균을 구하여 출력해 봅니다.
	 */		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("배열에 저장 할 과목수를 입력하세요.");
			int n = sc.nextInt();// 3
			
			System.out.println("학생수를 입력하세요.");
			int su = sc.nextInt();
			
			String name[] = new String[su];
			double sungjukdata[][] = new double[su][5];
			
			for(int i=0; i < name.length; i++) {
				int sum = 0;
				double aver = 0.0;
				
				System.out.println("이름");
				name[i] = sc.next();
				
				for(int j=0; j < n; j++) {
					if(j == 0) {
						System.out.println("kor:");
						sungjukdata[i][0] = sc.nextInt();
						sum+=sungjukdata[i][j];
					}
					
					if(j == 1) {
						System.out.println("eng:");
						sungjukdata[i][1] = sc.nextInt();
						sum+=sungjukdata[i][j];
					}
					
					if(j == 2) {
						System.out.println("mat:");
						sungjukdata[i][2] = sc.nextInt();
						sum+=sungjukdata[i][j];
					}
					
					//총점과 평균 구하기
					sungjukdata[i][3] = sum;
					aver = sum / 3.0;
					sungjukdata[i][4] = aver;
				}
				
			}
			
		System.out.println("----------------------------");
		System.out.println("이름\t총점\t평균");
		System.out.println("----------------------------");	
			
		for(int i=0; i < name.length; i++) {
					
			System.out.println((name[i]) + "\t" + sungjukdata[i][3] + "\t" + sungjukdata[i][4]);			
			}
		System.out.println("성적 데이터를 계속 처리하렵니까? (yes/no)");
		 String conti = sc.next();
		 
		 if(conti.equals("yes")) {
			 continue;
		 }else {
			 System.exit(0);
			 break;
		 }
		}
	}//main end

}//class end
