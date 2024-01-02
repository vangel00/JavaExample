package condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ifSample10_subaesu {

	public static void main(String[] args) {
	// 임의의 수를 입력 받아서, 1~100사이의 숫자인지 판별하고, 그 수가 7의 배수인지를 확인하여 출력해 보세요.
		int count = 0;
		
		Scanner sc = new Scanner(System.in);		
		try {
			while(count < 6) { 
				System.out.println("임의의 수를 입력해 주세요."); 
				int su = sc.nextInt();
				
				if(su >=1 && su <=100 && su % 7 == 0) {
					System.out.println(su + "가 1~100사이이고, 7의 배수 입니다.");
				}else {
					System.out.println(su + "가 1~100사이가 아니거나, 7의 배수가 아닙니다.");
				}
			}
		}catch(InputMismatchException e) {
			e.printStackTrace();			
			System.out.println("입력값이 잘못되었습니다.");
		}
	}

}


