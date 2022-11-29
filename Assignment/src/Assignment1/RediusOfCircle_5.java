package Assignment1;
// Write a java program to enter radius of a circle and find its diameter , circuference and area
import java.util.Scanner;

public class RediusOfCircle_5 {
	public static void main(String[] args) {
		
			float radius, diameter, circum , area;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Radius");
			radius =sc.nextFloat();
			
			diameter = 2*20;
			circum = 2*(float)3.14 * 20;
			area = (float)3.14*(20*20);
			
			System.out.println("Diameter " +diameter);
			System.out.println("Circum " + circum);
			System.out.println("Area " +area);
			
			sc.close();
			
	}

}
