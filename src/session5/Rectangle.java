package session5;

public class Rectangle extends Figure {

	// initializing double data member

	double length;

	// initializing double data member

	double width;

	// declaring constructor with parameters

	Rectangle(double length, double width) {

		this.length = length;
		// setting length value in instance variable

		this.width = width;
		// setting width value in instance variable
	}

	@Override
	void findArea() {

		double area = length * width;
		// initializing area with length and width value

		System.out.println("Area of Rectangle is " + area);
		// prints Area of Rectangle is 1067.04

	}

	@Override
	void findPerimeter() {

		double perimeter = 2 * length + 2 * width;
		// initializing perimeter with length and width value

		System.out.println("Perimeter of Rectangle is " + perimeter);
		// prints Perimeter of Rectangle is 138.0

	}

}
