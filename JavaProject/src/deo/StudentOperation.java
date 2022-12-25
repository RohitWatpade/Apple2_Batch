package deo;

import java.util.Arrays;
import java.util.Scanner;

import pojo.Employee;
import pojo.Student;

public class StudentOperation {
	
	Student st[]=new Student[5];
	Scanner sc=new Scanner(System.in);
	
	
	public void mainArray() {
		
		System.out.println("Student size: ");
		int size=sc.nextInt();
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter id, name, dept, mraks, contact, email");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int marks=sc.nextInt();
			long contact=sc.nextLong();
			String email=sc.next();
			
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			s.setContact(contact);
			
			s.setEmail(email);
			
			
			st[i]=s;
		}
	}
	
	public void insertStudent()
	{
		System.out.println("Enter id, name, dept, mraks, contact, email");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		int marks=sc.nextInt();
		long contact=sc.nextLong();
		String email=sc.next();
		
		Student s=new Student();
		s.setId(id);
		s.setName(name);
		s.setDept(dept);
		s.setMarks(marks);
		s.setContact(contact);
		s.setEmail(email);
		
		for(int i=0; i<st.length; i++)
		{
			if(st[i]==null)
			{
				st[i]=s;
				break;
			}
				
		}
	}
	
	public void displayStudentData()
	{
		System.out.println(Arrays.toString(st));
	}
	
	public void updateStudentData()
	{
		System.out.println("Update student id, email, contact");
		int id=sc.nextInt();
		String email=sc.next();
		long contact=sc.nextLong();
	
	for(Student s1:st)
	{
		if(s1!=null)
		{
			if(s1.getId()==id)
			{
				s1.setContact(contact);
				s1.setEmail(email);
			}
		}
	}
 }
	
	/*public void searchStudentData()
	{
		Student s[]=new Student[st.length];
		System.out.println("Enter the id of student to search");
		int id=sc.nextInt();
		
		int index=0;
		
		for(int i=0; i<st.length; i++)
		{
			if(st[i]!=null)
			{
				if(st[i].getId()==id)
				{
					
				}*/
				
				
				public void deleteEmployee()
				{
					Student s[]=new Student[st.length];
					System.out.println("enter the id of emplyee to delete: ");
					int id=sc.nextInt();
					
					int  index=0;
					
					for(int i=0;i<st.length;i++)
					{
						if(st[i]!=null)
						{
							if(st[i].getId()==id)
							{
								index=i;
							}
						}
					}
					int j=0;
					for(int i=0;i<st.length;i++)
					{
						if(i==index)
						{
							continue;
						}
						else
						{
							st[j]=st[i];
							j++;
						}
					}
					for(int i=0;i<s.length;i++)
					{
						st[i]=s[i];
					}
			}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


	
	


