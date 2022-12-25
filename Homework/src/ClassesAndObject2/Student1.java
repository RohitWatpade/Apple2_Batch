package ClassesAndObject2;

import java.util.Scanner;
// Reference variable and Instance variable
public class Student1 {
	
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
		

	/*	Scanner sc=new Scanner (System.in);
		System.out.println("Enter the id : ");
		int id=sc.nextInt();
		System.out.println("Enter the name : ");
		String name=sc.next();
		System.out.println("Enter the dept : ");
		String dept=sc.next();
		System.out.println("Enter the marks|: ");
		int m=sc.nextInt();
		
		System.out.println("-------------------------");
		
		System.out.println("Enter the id : ");
		int id1=sc.nextInt();
		System.out.println("Enter the name : ");
		String name1=sc.next();
		System.out.println("Enter the dept : ");
		String dept1=sc.next();
		System.out.println("Enter the marks|: ");
		int m1=sc.nextInt();
		
		System.out.println("-------------------------");
		
		System.out.println("Enter the id : ");
		int id2=sc.nextInt();
		System.out.println("Enter the name : ");
		String name2=sc.next();
		System.out.println("Enter the dept : ");
		String dept2=sc.next();
		System.out.println("Enter the marks|: ");
		int m2=sc.nextInt();*/
		
//		Student1 s1=new Student1();
//		s1.id=101;
//		s1.name="Rohit";
//		s1.dept="MCA";      
//		s1.marks=72;
//		s1.display();
//				
	/*
		Student1 s2=new Student1();
		
		s2.setDate(id, name, dept, m);
		s2.display();
		
		Student1 s3=new Student1();
		s3.setDate(id1, name1, dept1, m1);
		s3.display();
		
		Student1 s4=new Student1();
		s3.setDate(id2, name2, dept2, m2);
		s3.display();*/
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
