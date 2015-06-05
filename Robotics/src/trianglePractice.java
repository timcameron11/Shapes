import java.util.Scanner;

import org.presidentbusiness.shapes.Shape;
import org.presidentbusiness.shapes.Triangle;
import org.presidentbusiness.shapes.Circle;
import org.presidentbusiness.shapes.Rectangle;
public class trianglePractice {


	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scanner= new Scanner(System.in);
		
		String proceede = "yes";
		
		
		while (proceede.equals("yes") ){
			Shape createdShape = createShape(scanner);
			
			System.out.println("This is Shapes area");
			System.out.println(createdShape.area());
			System.out.println("This is Shapes perimiter");
			System.out.println(createdShape.perimiter());
			
			System.out.println("Do you want to continue");
			proceede = scanner.next();
			
		}
	}
	public static Shape createShape(Scanner scanner){
		
		Shape shape = null;
		System.out.println("What Shape do you want");
		
		String requestedShape = scanner.nextLine();
		
		if(requestedShape.equals("Circle")){
			System.out.println("Insert Radius");
			double Radius = scanner.nextDouble();
			shape = new Circle(Radius);
		}
		else if(requestedShape.equals("Rectangle")){
			System.out.println("Insert Length");
			double Length = scanner.nextDouble();
			System.out.println("Insert Width");
			double Width = scanner.nextDouble();
			shape = new Rectangle (Length, Width);
		}
		else if(requestedShape.equals("Triangle")){
			System.out.println("Insert Base");
			double Base = scanner.nextDouble();
			System.out.println("Insert Height");
			double Height = scanner.nextDouble();
			shape = new Triangle (Base, Height);
				
		}
	
		return shape;
	}	
		
}	
		
	
		

