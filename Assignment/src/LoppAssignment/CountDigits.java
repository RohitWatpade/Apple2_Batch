package LoppAssignment;
//8 Write a program to count number of digits in any number.
import java.util.Scanner;


public class CountDigits {

public static void main(String[] args) { 

    int num, countFactor=0;
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    num=sc.nextInt();


while(num!=0)
{
num=num/10;
countFactor++;
}
System.out.println(countFactor);
sc.close();
}
}
