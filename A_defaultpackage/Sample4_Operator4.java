
public class Sample4_Operator4 { 

	public static void main(String[] args) { 
		// bitwise Operation
		/* bit and: &
		 * bit or : |
		 * ~ : 부호변환 연산
		 * ^ : exor 연산
		 * <<: * 2
		 * >>: / 2
		 * >>>: 연산이 끝날때까지 반복 처리
		 */
		
		int x = 20;		
		int y = 15;
		/* 이진수로 변환
		 *     128 64 32 16 8 4 2 1
		 * ------------------------
		 * 20:  0   0  0  1 0 1 0 0 (2)
		 * 15:  0   0  0  0 1 1 1 1 (2)
		 * ----------------------------
		 * and: 0   0  0  0 0 1 0 0 
		 * or : 0   0  0  1 1 1 1 1
		 */
		int sum = x & y;
		System.out.println("bit and : " + sum);// 4
		
		int sum2 = x | y;
		System.out.println("bit and : " + sum2);// 31
		
		int xx = -125;
		int xxx= ~(xx);
		System.out.println("~: " + xxx);// 124
		
		int xxxx = ~(124);
		System.out.println(xxxx);// -125 
		
		int yy = 20;
		int zz = 12;
		/* A B   EXOR => 암호화에 사용
		 * ------------------
		 * 0 0     0
		 * 0 1     1
		 * 1 0     1
		 * 1 1     0
		 * ------------------
		        128 64 32 16 8 4 2 1
		 * ------------------------
		 *  20:  0   0  0  1 0 1 0 0 (2)
		 *  12:  0   0  0  0 1 1 0 0 (2)
		 * ----------------------------
		 * exor: 0   0  0  1 1 0 0 0 
		 * 
		 */
		int sum3 = yy ^ zz;
		System.out.println("^: " + sum3);// 24
		
		int a = 250; // 250x2=500x2=1000x2=2000x2=4000x2=8000
		int sum4 = a << 5;
		System.out.println(sum4);// 8000
		
		int b = 250; // 250/2=125/2=62/2=31/2=15/2=7
		int sum5 = b >> 5;
		System.out.println(sum5);// 7
		
		int c = 250; // 250/2=125/2=62/2=31/2=15/2=7
		int sum6 = b >>> 9;
		System.out.println(sum6);// 7
		
	//문제> k가 -1이하이거나 20이상이고, 3과 15사이에 존재하며, 8이 아닙니다.
		// 이 결과는 무엇일까요?
		 int k=2000;
		 
		 boolean  m = ((k <= -1 || k >= 20) && (k >= 3 && k <= 15) && (k != 8));
		System.out.println(m);// false
	}
	
	
}



