package ArraySample;

import java.util.InputMismatchException;
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
public class Array1_concept {

	public static void main(String[] args) {
		// 배열에 사용할 임의의 데이터를 n개 입력하여 그 배열의 데이터의
		// 합계와 평균을 구하여 출력해 봅니다.
		int jumsu = 0;// 메모리상에서 jumsu라는 변수를 사용하여 0으로 초기화, 지역변수
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			int sum = 0;
			
			try {
				System.out.println("입력할 데이터의 갯수를 입력해 주세요.");
				int n = sc.nextInt();// 10

				int[] scores = new int[n];// [0] ~ [9]

				System.out.println("데이터 " + n + "개를 입력해 주세요.");

				// 반복문: 초기값 조건식 증가값
				for (int i = 0; i < scores.length; i++) {
					
					jumsu = sc.nextInt();

					// scores[0]= 100, scores[1]=98, [2]=80, .....
					scores[i] = jumsu;
					sum += scores[i];// 합계 구하기
				}
				double aver = sum / scores.length;
				System.out.println("합계 : " + sum);
				System.out.printf("평균 : %5.2f", aver);

				System.out.println();
				System.out.println("데이터를 다시 확인 입력하시겠습니까?(yes/no)");
				String str = sc.next();

				if (str.equals("yes")) {
					continue;
				} else {
					System.out.println("프로그램을 종료 합니다.");
					run = false;
					break;
				}
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("데이터 갯수의 타입(int가 정상)이 잘못되었습니다.");
				sc.nextLine();
			}
		}
	}

}
