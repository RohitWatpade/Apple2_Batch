package ClassesAndObject2;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String input = "java is a good programming language";
		 // char search = 'a';             // Character to search is 'a'.
		  
		  int count=0;
		  char ch;
		  Scanner sc=new Scanner(System.in);
		  ch=sc.next().charAt(0);
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == ch)
		      count++;
		  }
		  
		  System.out.println(count);
		  }
	}


