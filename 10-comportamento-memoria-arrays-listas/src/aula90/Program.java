package aula90;

public class Program {

	public static void main(String[] args) {

		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
		
		// wrapper class
		
		int x2 = 20;
		
		Integer obj2 = x2;
		
		System.out.println("x2 " + x2);
		
		int y2 = obj2 * 2;
		
		System.out.println(y2);

	}

}
