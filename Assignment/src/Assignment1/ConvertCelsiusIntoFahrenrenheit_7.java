package Assignment1;
import java.util.Scanner;

// Write a java program to enter tempreture in celsius and convert it into fehrenheit.
public class ConvertCelsiusIntoFahrenrenheit_7 {
	public static void main(String[] args) {
		float c,f;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Tempreture : ");
		c=sc.nextFloat();
		
		f = ((c* 9)/5)+32 ;
		System.out.println("Tempreture of Fehrenheit : " +f);
		
		sc.close();
		
	}

}


