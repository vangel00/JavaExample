package repeat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 데이터 종류별 체크 메소드
 */
public class forSample10_APIClass3 {
	
	
	public static void main(String[] args) { 
		//replace: 대체 메소드
		
		String s = null;
			
		Scanner sc = new Scanner(System.in);		
		System.out.println("문자열을 입력해 주세요.");
		if(sc.hasNext())
			s = sc.next();// "자바는.객체지향.언어.입니다.자바는.풍부한.API를.지원합니다."
		System.out.println("String: " + s);//
		
		//문제> 자바라는 단어를 Java로 변경하여 출력하세요.
		// "Java는 객체지향 언어 입니다. Java는 풍부한 API를 지원합니다."
		//String oldJava = "자바는.객체지향.언어.입니다.자바는.풍부한.API를.지원합니다.";
		//StringTokenizer st = new StringTokenizer(s, ".");
		
			String newJava = s.replace("자바", "Java");  
			String newJava2 = newJava.replace(".", " ");  
			System.out.println(newJava2);// 
			
		
	} // main end
} //class end
