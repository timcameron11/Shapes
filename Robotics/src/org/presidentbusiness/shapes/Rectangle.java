package org.presidentbusiness.shapes;

public class Rectangle implements Shape{

	double length;
	double width;
	
	public Rectangle (double length, double width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area(){
		
		return (length * width);
	}
	
	@Override
	public double perimiter(){
		
		return ((length + width) * 2);
	}
}
