package StringAssignments;
//15.Write a Java program to search all occurrences of a character in given string.
import java.util.Scanner;
public class SearchOccurrences {
		private static Scanner sc;
		public static void main(String[] args) {
			String facStr;
			char ch;
			int i = 0;
			
			sc= new Scanner(System.in);

			System.out.print("\nPlease Enter any String =  ");
			facStr = sc.nextLine();
			
			System.out.print("\nEnter the Character to search =  ");
			ch = sc.next().charAt(0);
			
			while(i < facStr.length())
			{
				if(facStr.charAt(i) ==  ch) {
					System.out.format("\n %c Found at Position %d ", ch, i + 1);
				}
				i++;
			}
		}

}