package session5;

public class TestFigure {

	public static void main(String[] args) {

		Circle shape1 = new Circle(10.5);
		// creating instance object for Circle sub class

		Rectangle shape2 = new Rectangle(23.4, 45.6);
		// creating instance object for Rectangle sub class

		Triangle shape3 = new Triangle(14.6, 35.8, 56.3, 23.8, 32.5);
		// creating instance object for Triangle sub class

		shape1.findArea();
		// calling findArea method in Circle

		shape1.findPerimeter();
		// calling findPerimeter method in Circle

		shape2.findArea();
		// calling findArea method in Rectangle

		shape2.findPerimeter();
		// calling findPerimeter method in Rectangle

		shape3.findArea();
		// calling findArea method in Triangle

		shape3.findPerimeter();
		// calling findPerimeter method in Triangle

	}

}
