package repeat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/* 데이터 종류별 체크 메소드
 */
public class forSample9_dataType {
	
	
	public static void main(String[] args) { //3000
		double d = 0.0;
		int i = 0;
		String s = null;
		boolean b = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수형을 입력해 주세요.");
		if(sc.hasNextInt())
			i = sc.nextInt();//
		System.out.println("Integer: " + i);//		
		
		System.out.println("실수형을 입력해 주세요.");
		if(sc.hasNextDouble())
			d = sc.nextDouble();//
		System.out.println("Double: " + d);//
		
		System.out.println("문자열을 입력해 주세요.");
		if(sc.hasNext())
			s = sc.next();//
		System.out.println("String: " + s);//
		
		System.out.println("불리언형으로 입력해 주세요.");
		if(sc.hasNextBoolean())
			b = sc.nextBoolean();//
		System.out.println("Boolean: " + b);//
		
	} // main end
} //class end
