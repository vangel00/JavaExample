import java.util.Scanner;

public class Sample4_Operator8 { 

	public static void main(String[] args) { 
		// 객체의 내용이나 주소를 참조하여 비교하는 연산자
		/* 기본 자료형에 한하여 사용 가능 (==): 객체의 내용을 비교하여 참, 거짓으로 판별
		 * equals() : 객체의 주소값을 기준으로 판별 
		 */
		String str1 = new String("문자");//500
		String str2 = new String("문자");//500
		String str3 = new String("숫자");//1200
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // false
		
		System.out.println(str1 == str2);// false
		
		str1 = str2;
		System.out.println(str1 == str2);// true
		
		// C : 
		// *str1:
		// str1 = &str3;
		
		str1 = str3;// deep copy, call by reference
		System.out.println(str1 == str3);// true		
		System.out.println(str1.equals(str3));// true
		
		int a = 100;//call by value
		int b = 100;//call by value
		
		String xx = (a == b)? "true":"false";
		System.out.println(xx);// true
		
		//int xxx = (a.equals(b))? "true":"false";
		//System.out.println(xxx);// true
		
		//web project
		 if(str1.equals("문자")) {
			 
		 }
		
	}
	
	
}



