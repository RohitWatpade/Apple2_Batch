package AssignmentSwitchCase;


import java.util.Scanner;

public class NumberToWord  {
	
public static void main(String[] args) {
		
		int m;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		m=input.nextInt();
       
		switch(m) {
		
		case 1:
		    System.out.println("One");
		    break;
		    
		case 2:
		    System.out.println("Two");
		    break;
		    
		case 3:
		    System.out.println("Three");
		    break;
		    
		case 4:
		    System.out.println("Four");
		    break;
		    
		case 5:
		    System.out.println("five ");
		    break;
		    
		
		 default:
			 System.out.println("Enter valid Number!!!");
		    
		    
		}
	
	input.close();	
		
}
}

