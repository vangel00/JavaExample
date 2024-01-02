package repeat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/* DeciamlFormat
 * NumberFormat
 * 환율이나 백분율, 화폐단위등을 출력할 때 사용 
 */
public class forSample8_DeciamlFormat {
	
	public static void main(String[] args) { //3000
			
		Scanner sc = new Scanner(System.in);
		System.out.println("실수형을 입력해 주세요.");
		double num = sc.nextDouble();
		
		DecimalFormat df1 = new DecimalFormat("###, ###");
		System.out.println(df1.format(num));// 1000.000 => 1,000 
		
		DecimalFormat df2 = new DecimalFormat("###, ##0.00");
		System.out.println(df2.format(num));// 123.45 
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance();
		System.out.println(nf1.format(num));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		System.out.println(nf2.format(12300000));
		
		NumberFormat nf3 = NumberFormat.getPercentInstance();
		System.out.println(nf3.format(num));
		
		NumberFormat nf4 = NumberFormat.getPercentInstance();
		System.out.println(nf4.format(0.33));
	
	} // main end
} //class end
