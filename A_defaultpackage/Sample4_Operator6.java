
public class Sample4_Operator6 { 

	public static void main(String[] args) { 
		// 증가(+1)감소(-1) 연산자
		/*
		 * 대입후 연산: y--
		 * 연산후 대입: ++x
		 * 연산의 우선순위 : ( )
		 */
		int x = 10, y=30;
		
		// 11 + 30   11    30(29 기억)
		int sum = (++x) + (y--);//가독성이 좋아집니다.		
		System.out.println(sum);// 41
		
		x++;// 12
		System.out.println(x);// 12

		++x;// 13
		System.out.println(x);// 13

		// y의 기억된 29값이 출력됨.
		System.out.println(y);// 29

	//문제> 
	 int xx=0, yy=10, z=50, sum1, sum2;	
		
		xx++;// 1
		System.out.println(xx);// 1
		
		xx--;// 0
		System.out.println(xx);// 0
		
		++xx;// 1
		System.out.println(xx);// 1
		
		//      1 +  11  - 50(49)
		sum1 = xx + ++yy - z--;// -38
		System.out.println(sum1);// -38
		
		//    -38(-37) - 11 
		sum2 = sum1++ - yy;// -49
		System.out.println(sum2);// -49
		
		//49(48)
		z--;// 48
		System.out.println(z);// 48
		
		
		
	}
	
	
}



