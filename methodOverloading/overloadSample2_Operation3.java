package methodOverloading;

import java.util.Scanner;

public class overloadSample2_Operation3 {
 
	static Scanner sc = new Scanner(System.in);
	
	private static int sequre() {
		int x = sc.nextInt();
		int xx = x * x;
		return xx; 
	}

	private static double sequre(double x) {
		double xx = x * x;
		return xx; 
	}
	
	public static void main(String[] args) { 
	
		while(true) {
		System.out.println("==============");
		System.out.println("1.정수형의 자승  ");
		System.out.println("2.실수형의 자승  ");
		System.out.println("3.종료         "); 
		System.out.println("==============");
		System.out.println("연산할 메뉴를 선택해 주세요.");
	
		String su = sc.next();//
	
		switch(su) {
		case "1": int result = sequre(); 
					System.out.println(result);
					break;
		
		case "2": System.out.println("실수형 데이터를 입력하시오.");
					double x = sc.nextDouble();
					double result2 = sequre(x);
					System.out.println(result2);//
					break;
		default: 
				System.exit(0);				
		
		}
		
		}
	}


}
