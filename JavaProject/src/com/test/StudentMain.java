package com.test;

import java.util.Arrays;
import java.util.Scanner;

//import dao.StudentOperation;
public class StudentMain {
	

		public static void main(String[] args) {
			
			com.deo.StudentOperation st=new com.deo.StudentOperation();
			st.mainArray();
			st.displayStudentData();
		  //  st.insertStudent();
		//	st.displayStudentData();
			
			//st.updateStudentData();
			//st.displayStudentData();
			
			/*st.searchStudentData();
			st.displayStudentData(); */
			
			
			int m;
			Scanner input= new Scanner(System.in);
			System.out.println("Enter a choice: ");
			System.out.println("Press 1 Insert data");
			System.out.println("Press 2 Update data");
			System.out.println("Press 3 Search data");
			System.out.println("Press 4 Delete data");
			m=input.nextInt();
	       
			switch(m) {
			
			case 1:
				st.insertStudent();
				//System.out.println("Enter id, name, dept, mraks, contact, email");
				
				st.displayStudentData();
			
			    break;
			  
			case 2:
				st.updateStudentData();
				st.displayStudentData();
				
		         break;
		         
			 case 3 :

			  //  st.searchStudentData();
			    st.displayStudentData(); 
			    
			 break;  
			 
			 case 4:
				 st.deleteEmployee();
				 st.displayStudentData();
				 
			 default:
				 System.out.println("Enter valid Number!!!");

		}

	
		}
		}

