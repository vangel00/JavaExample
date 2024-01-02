package OOP_Inheritance;

public class InheritanceSuber implements suberInterface {

	@Override
	public void suber(int x, int y) {
		int sum = x - y;
		System.out.println("Sub(): " + sum); 
		
	}

	
}
