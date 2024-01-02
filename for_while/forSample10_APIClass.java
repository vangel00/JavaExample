package repeat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 데이터 종류별 체크 메소드
 */
public class forSample10_APIClass {
	
	
	public static void main(String[] args) { 
		String s = null;
			
		Scanner sc = new Scanner(System.in);		
		System.out.println("문자열을 입력해 주세요.");
		if(sc.hasNext())
			s = sc.next();// "홍길동*박수홍*하석*한강빈*안혜지*박이레*김수환*임서하"
		System.out.println("String: " + s);//
		
		StringTokenizer st = new StringTokenizer(s, "*");
		int surang = st.countTokens();
		
		/*
		 * for(int i=0; i < surang; i++) { 
		 * 	String token = st.nextToken();
		 * 	System.out.print(token + " ");// 홍길동 박수홍 하석 한강빈 안혜지 박이레 김수환 임서하 
		 * }
		 */
		
		//while문으로 처리
		while(st.hasMoreTokens()) {
			String token2 = st.nextToken();
			System.out.print(token2 + " ");// 홍길동 박수홍 하석 한강빈 안혜지 박이레 김수환 임서하
		}
		
		
		
	} // main end
} //class end
