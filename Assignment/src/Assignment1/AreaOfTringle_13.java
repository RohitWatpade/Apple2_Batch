package Assignment1;
import java.util.Scanner;

//Write a java program to enter base and height of a tringle and find its area.
public class AreaOfTringle_13 {
	public static void main(String[] args) {
		float b,h,area;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter base and height :");
		b=sc.nextFloat() ;
		h=sc.nextFloat();
		
		area = (b/h)/2;
		System.out.println("Area of tringle " +area);
		sc.close();
	}

}
