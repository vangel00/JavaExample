/*
 * 데이터 자료형
 * 정수형: byte(-128~127), short(-65536~65535), int(-21억~21억), long(-92.......
 * 실수형: float(8byte,단정도 실수형: 소수점 이하 6자리정도 인정), 
 * double(16byte, 배정도 실수형, 15자리정도 인정), 지수형: Exponent(가수부, 지수부) 
 * 정밀도가 아주 높다. 그러나 오차가 발생 합니다.
 */
public class Sample3_dataType5 {

	public static void main(String[] args) {
		float a = 2122000000000000000f;
		float b =  300000000f;
		
		float sum = a + b; // a=int, b=int, (short) => 강제적 형변환
		System.out.println(sum);// 2.12199999E18
		// 2.12199999E18 => 2121999990000000000.0
		
		double c = 2.12199999E99;
		//2121999900000000000000000000....79개입력
		System.out.println(c);// 
	}
}


// byte > short > int > long > float > double
