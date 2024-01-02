package methodOverloading;

/*
 * 메소드 오버로딩? 
 * - 메소드 이름은 같으나, 데이터 타입과 데이터 갯수가 다르면 다른 역을 하는 메소드를 말합니다. 
 */
public class overloadSample1_default {

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
		print("안녕하세요?"); 
		print("다시만나요.", 5);
		
	}
	private static void print(String string, int i) {
		int i2 = 0;
		for(   ; i2 < 5; i2++) {
			System.out.println(string);//
		}
		
	}
	private static void print(String string) {
		
		String str = string + "반갑습니다.";
		System.out.println(str);//
	}
	
		
}
