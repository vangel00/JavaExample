package condition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ifSample9 {

	public static void main(String[] args) {
	// 임의의 수를 입력 받아서, 그 수가 hint에 주어진 수보다 큰지, 작은지, 같은지를 판별하여 출력해 보세요.
	// hint> 555
		int hint = 555;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);		
		
		//try area에는 처리되면서 잘못될 부분이 있는 경우에 반드시 예외 처리를 합니다.
		try {
			while(count < 6) { // 무한 loop
				System.out.println("임의의 수를 입력해 주세요."); 
				int su = sc.nextInt();//aaaa
				
				if(su > hint) {
					System.out.println(su + "가 큽니다.");
				}else if(su < hint) {
					System.out.println(su + "가 작습니다.");
				}else {
					System.out.println(su + "같은 수 입니다.");
				}
				count++;
			}
		}catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("입력값이 잘못되었습니다.");
		}
	}

}
