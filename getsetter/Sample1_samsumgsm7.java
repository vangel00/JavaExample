package getsetter;

import java.util.Scanner;

/* getter&setter => VO = DTO 역할(MVC2 pattern)
 * getter: 저장된 정보를 호출하여 출력
 * setter: 정보를 데이터베이스(여기서는 메모리로 한정)에 저장
 * 
 * 삼성 자동차 sm7이 색상은 빨강색이고, 가격은 500원인데, 이름은 samsung_sm7이다.
 * 이것을 저장하고, 출력해 보세요.
 * 조건> get/setter 이용
 * - setColor(): red, getColor(), String
 * - setPrice(): 500, getPrice(), int
 * - setName(): samsung_sm7, getName(), String
 */
public class Sample1_samsungsm7 {

	private String name;//null => samsung_sm7
	private int price;// 0 => 500
	private String color; //null => red

	//get&setter setting
	public String getName() {
		return name;// samsung_sm7
	}

	public void setName(String name) {
		this.name = name;// samsung_sm7
	}

	public int getPrice() {
		return price;//500
	}

	public void setPrice(int price) {
		this.price = price;// 500
	}

	public String getColor() {
		return color;//red
	}

	public void setColor(String color) {
		this.color = color;// red
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String color = sc.next();// red
		int price = sc.nextInt();// 500
		String name = sc.next();// samsung_sm7
		
		Sample1_samsungsm7 ss7 = new Sample1_samsungsm7();
		ss7.setColor(color);// red
		ss7.setPrice(price);// 500
		ss7.setName(name);// samsung_sm7
		
		System.out.println("자동차 색상: " + ss7.getColor()); // red
		System.out.println("자동차 가격: " + ss7.getPrice());// 500
		System.out.println("자동차 이름: " + ss7.getName()); // samsung_sm7
	}

	

}
