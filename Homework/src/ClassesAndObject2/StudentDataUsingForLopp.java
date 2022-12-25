package ClassesAndObject2;

import java.util.Scanner;
// Reference variable and Instance variable
public class StudentDataUsingForLopp {
	
	int id,marks;
	String name,dept;
	
	void setDate(int i ,String n, String d, int m)
	{
		id=i;
		name=n;
		dept=d;
		marks=m;
		
	}
	void display()
	{
		System.out.println(id+ " "+name+" "+dept+" "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.println("Enter the data for "+i+" Student : ");
			//Scanner sc=new Scanner (System.in);
			System.out.println("Enter the id : ");
			int id=sc.nextInt();
			System.out.println("Enter the name : ");
			String name=sc.next();
			System.out.println("Enter the dept : ");
			String dept=sc.next();
			System.out.println("Enter the marks|: ");
			int m=sc.nextInt();
			
			Student1 s=new Student1();
			s.setDate(id, name, dept, m);
			s.display();
		}
		
	}
}