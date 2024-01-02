package methodSample;

/* 메소드 오버로딩?
 * - 메소드 이름은 같으나 인자의 갯수나 데이터 형이 다르면 다르게 인식하여 처리 됩니다. 
 */
public class methodSample5_example {
	
	private static int sum;//0 => 4 => 8 => 12 => 18 => 15. 
	private static double sum2;//0.0 => 

	private static void sum(int i) {
	    sum = i;	
	    System.out.println(sum);//4
	}
	private static void sum(int i, int j) {
		sum = i + j;		
		System.out.println(sum);// 8
	}
	private static void sum(int i, int j, int k) {
		sum = i + j + k;		
		System.out.println(sum);// 12
	}
	private static void sum(int i, int j, int k, int l) {
		sum = i + j + k + l;	
		System.out.println(sum);// 18
	}
	
	private static void sum(int i, int j, int k, int l, int m) {
		sum = i + j + k + l + m;	
		System.out.println(sum);// 15
	}
	private static void sum(double d, double e, double f, double g) {
		sum2 = d + e + f + g;
		System.out.println(sum2);// 
	}

	public static void main(String[] args) { 
	/*
	 * 문제> 정수형 데이터 5개를 입력 받아서, 총합계를 구하여 출력하세요. 
	 */
		sum(4);
		sum(4, 4);
		sum(4, 4, 4);
		sum(5, 5, 4, 4);
		sum(1, 2, 3, 4, 5);		
		sum(11.12, 22.33, 33.44, 44.45);
		
	}
	
	

	

	

	
		
}
