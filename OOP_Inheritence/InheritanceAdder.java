package OOP_Inheritance;

public class InheritanceAdder implements addInterface{

	@Override
	public void adder(int x, int y) {
		int sum = x + y;
		System.out.println("Add(): " + sum);// 
	}

	
}
