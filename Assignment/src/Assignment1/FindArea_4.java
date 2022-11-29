package Assignment1;
import java.util.Scanner;

// write a java program to enter lengh and breadth of a rectangle and find its Area .
public class FindArea_4 {
	public static void main(String[] args) {
		int lengh, breadth, area;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		lengh=sc.nextInt();
		breadth=sc.nextInt();
		
		area= lengh*breadth;
		System.out.println("Area Of Rectangle is : " +area);
		
		sc.close();

  }
}
