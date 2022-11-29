package Assignment1;
import java.util.Scanner;

// Write a java program to enter tempreture in fehrenheit and convert it into celsius
public class ConvertFahrenheitIntoCelsius_8 {

		public static void main(String[] args) {
			float f ,c;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter fahrenheit ");
			f=sc.nextFloat();
			
			c = ((f - 32)*5)/9;
			System.out.println("Tempreture of celsius : " +c);
			
			sc.close();
		}


}
