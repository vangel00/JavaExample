package condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ifSample5_sungjuk4 {

	public static void main(String[] args) {
		// 데이터를 입력 받아서, 학점을 구하여 출력해 보세요.
		// 조건> 시험 점수를 5개 입력 받는 것으로 합니다.
		// 반복문(for, while, do~while)중에서 하나를 선택하여 처리합니다.
		int count = 0;

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		// EOF: 데이터가 없으면, 끝으면...
		while (run) {
			System.out.println("성적을 입력해 주세요.");
		
			 try {
				double kor = sc.nextDouble();

				if (kor <= 100.0 && kor >= 90.0) {
					System.out.println("A학점");
				} else if (kor <= 89.0 && kor >= 80.0) {
					System.out.println("B학점");
				} else if (kor <= 79.0 && kor >= 70.0) {
					System.out.println("C학점");
				} else if (kor <= 69.0 && kor >= 60.0) {
					System.out.println("D학점");
				} else if (kor <= 59.0 && kor >= 0.0) {
					System.out.println("F학점");
				} else {
					System.out.println("잘못된 데이터가 입력이 되었습니다.");
				}

				// 삼항 연산자
				String grade = (kor <= 100.0 && kor >= 90.0) ? "A"
						: (kor <= 89.0 && kor >= 80.0) ? "B"
								: (kor <= 79.0 && kor >= 70.0) ? "C" 
								: (kor <= 69.0 && kor >= 60.0) ? "D" : "F";
				System.out.println("학점은 " + grade); //

			
		}catch(InputMismatchException e) {
			System.out.println("점수는 숫자로 입력해 주세요.");
		}
			sc.nextLine();
		}
	}

}
