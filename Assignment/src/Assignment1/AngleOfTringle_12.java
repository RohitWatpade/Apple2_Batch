package Assignment1;
import java.util.Scanner;

// write a java program to enter two angle of a tringle and find the third angle.
public class AngleOfTringle_12 {
	public static void main(String[] args) {
		int angle1, angle2, angle;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		angle1=sc.nextInt();
		angle2=sc.nextInt();
		
		angle= 180 -(angle1+angle2);
		System.out.println("Third angle is : " +angle);
 
        sc.close();
	}

}
