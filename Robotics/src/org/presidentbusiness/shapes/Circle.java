package org.presidentbusiness.shapes;

public class Circle implements Shape{
	double radius;
	
	public Circle (double radius){
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return((Math.PI) * radius * radius);
	}

	@Override
	public double perimiter() {
		
		return (Math.PI * (radius + radius));
	}

}
