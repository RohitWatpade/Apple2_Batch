package Assignment1;
import java.util.Scanner;

// Write a java program to enter length in centimeter and convert it into meter and kilometer

public class ConvertIntoMeterAndKilometer_6 {

	public static void main(String[] args) {
		float c,m,k;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length in centimeter");
		c=sc.nextFloat();
		
		m=(float)(c/100);
		k=(float)(c/100000);
		 
		System.out.println("Length is meter : " +m +" Meter");
		System.out.println("Length is kilometer : " +k +" Kilometer");
		
		sc.close();
		;
	}
}
