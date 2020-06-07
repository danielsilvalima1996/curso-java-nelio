package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		AbstractShape c1 = new Circle(Color.BLACK, 2.0);
		AbstractShape r1 = new Rectangle(Color.WHITE, 3, 4);
		
		System.out.println("Circle color: " + c1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", c1.area()));
		System.out.println("Rectangle color: " + r1.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", r1.area()));
	}

}
