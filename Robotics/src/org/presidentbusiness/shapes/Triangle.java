package org.presidentbusiness.shapes;

public class Triangle implements Shape{	
	double base;
	double height;
	double hypotenuse;
	
	public Triangle( double base, double height){
		this.base = base;
		this.height = height;
		
		
		hypotenuse = Math.sqrt((base * base)+( height * height));
		
	}
	
	@Override
	public double perimiter(){
		
		return (base + height + hypotenuse);
		
	}
	
	@Override
	public double area(){
		
		return ((base * height)/2);
	}
}
