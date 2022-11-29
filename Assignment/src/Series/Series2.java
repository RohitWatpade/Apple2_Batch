// series 2 9 28 65
package Series;
import java.util.Scanner;
public class Series2 {
	public static void main(String [] args)
	{
			Scanner sc=new Scanner(System.in);
     	System.out.println("Enter series no");
		int i=sc.nextInt();
		 for ( ;i<=5;i++)
		 System.out.println(i*i*i+1+" ");
		
	}

}

