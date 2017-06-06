package session5;

public class Triangle extends Figure {

	// initializing double data member base

	double base;

	// initializing double data member height

	double height;

	// initializing double data member side1

	double side1;

	// initializing double data member side2

	double side2;

	// initializing double data member side3

	double side3;

	// declaring constructor with parameters

	Triangle(double base, double height, double side1, double side2, double side3) {

		this.base = base;
		// setting base value in instance variable

		this.height = height;
		// setting height value in instance variable

		this.side1 = side1;
		// setting side1 value in instance variable

		this.side2 = side2;
		// setting side2 value in instance variable

		this.side3 = side3;
		// setting side3 value in instance variable

	}

	@Override
	void findArea() {

		double area = (base * height) / 2;
		// initializing area with base and height value

		System.out.println("Area of Triangle is " + area);
		// prints Area of Triangle is 261.34

	}

	@Override
	void findPerimeter() {

		double perimeter = side1 + side2 + side3;
		// initializing perimeter with side1, side2 and side3 value

		System.out.println("Perimeter of Triangle is " + perimeter);
		// prints Perimeter of Triangle is 112.6

	}

}
