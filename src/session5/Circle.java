package session5;

import java.lang.Math;//importing Math function

public class Circle extends Figure {

	// initializing double data member

	double radius;

	// declaring constructor with parameter

	Circle(double radius) {

		this.radius = radius;
		// setting radius value in instance variable

	}

	@Override
	void findArea() {

		double area = Math.PI * radius * radius;
		// initializing area with Math function

		System.out.println("Area of Circle is " + area);
		// prints Area of Circle is 346.36059005827474

	}

	@Override
	void findPerimeter() {

		double perimeter = 2 * Math.PI * radius;
		// initializing perimeter with Math function

		System.out.println("Perimeter of Circle is " + perimeter);
		// prints Perimeter of Circle is 65.97344572538566

	}

}
