package StringAssignments;
//16.Write a Java program to convert uppercase string to lowercase.
import java.util.Scanner;
public class UpperToLower {
	
	
		private static Scanner sc;
		public static void main(String[] args) {
			String uppStr;
			
			sc= new Scanner(System.in);

			System.out.print("\nEnter Uppercase String to convert =  ");
			uppStr = sc.nextLine();
		
			String uppStr2 = uppStr.toLowerCase();	
			System.out.println("\nThe Lowercase String  =  " + uppStr2);
		}
	}


