package ClassesAndObject2;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("1st subject marks : ");
		float s1=sc.nextFloat();
		
		System.out.println("2nd subject marks : ");
		float s2=sc.nextFloat();
		
		System.out.println("3rd subject marks : ");
		float s3=sc.nextFloat();
		
		System.out.println("4rt subject marks : ");
		float s4=sc.nextFloat();
		
		System.out.println("5th subject marks : ");
		float s5=sc.nextFloat();
		
		Student a1=new Student();
		float p=a1.percentage(s1, s2, s3, s4, s5);
		a1.grade(p);
	}

}
