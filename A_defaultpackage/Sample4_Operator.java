/* 산술 연산자: 5가지, +, - , *, /(몫) , %(나머지)
 * 관계 연산자: 6가지, ==, !=, <, <=, >, >=
 * 논리 연산자: and, or, not, nand, nor, exor
 * 플립플롭 회로: D, T, JK..... 
 * 설계도(회로도) 그리기
 * 부폼 회로 완성
 * 직접 만들기
 */
public class Sample4_Operator { //3000번지 가정.

	public static void main(String[] args) { // 3200번지
		//Arithmetic Operation
		int x = 100, y = 20;// x= 3210, y=3220번지
		
		int sum = x + y;
		System.out.println("덧셈: " + sum); // 120
		
		short x2 = 100, y2 = 20;// x2 = 3310, y2 = 3320번지
		
		short sum2 = (short) (x2 - y2);
		System.out.println("뺄쎔: " + sum2);// 80
	}
	
	
}



