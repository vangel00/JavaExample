package methodSample;

import java.util.Scanner;

//문제> 3과목의 성적을 입력 받아서, 총점, 평균을 구하여 출력하세요. 
	/* 모든 처리 및실 행은 메소드를 이용합니다.
	 * - sungjukInput()
	 * - sungjukProcess()
	 * - sungjukOuput()
	 *
	 * static 
	 * - main area와 field area의 데이터 공유를 위하여 사용
	 * - 타 클래스와 데이터 공유를 위하여 사용
	 */
public class methodSample4_sungjuk {

	//class variable = global variable
	// --> 자동 초기화, 숫자 정수형=0, 숫자 실수형=0.0, 문자열=null

	static int kor;// 0 => 100
	private static int eng;// 0 => 95
	private static int mat;// 0 => 69
	static int total; // 0 => 264
	static double aver;// 0.0 => 88.0

	static void sungjukProcess() {
		total = kor + eng + mat;
		aver = total / 3;
	}

	private static void sungjukOuput() {
		System.out.println("총점: " + total);	 
		System.out.println("평균: " + aver); 
	}
	
	private static void sungjukInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어성적을 입력해 주세요.");
		 kor = sc.nextInt(); 
		System.out.println("영어성적을 입력해 주세요.");
		 eng = sc.nextInt(); 
		System.out.println("수학성적을 입력해 주세요.");
		 mat = sc.nextInt(); 		
	}
		
	public static void main(String[] args) { 
	
		sungjukInput(); //성적 입력 루틴
		
		sungjukProcess(); //성적 처리 루틴
		
		sungjukOuput(); //성적 결과 출력 루틴		
	}
	
}