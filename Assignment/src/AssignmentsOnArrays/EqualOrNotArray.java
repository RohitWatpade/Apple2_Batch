package AssignmentsOnArrays;
/*9. Write a Java program to test the equality of two arrays. Means e.g arr1[] = [12, 22,
32, 42, 52, 62] and arr2[] = [52, 22, 62, 12, 42, 22]
Here both arrays are equal*/

import java.util.Arrays;

public class EqualOrNotArray {
	 public static void main(String[] args) 

	    { 
	       int a[] ={12,22,32, 42, 52, 62};  

	        int b[] ={52, 22, 62, 12, 42, 22}; 

	        boolean result = Arrays.equals(a, b); 

	        if (result == true) { 

	            System.out.println("Two arrays are equal"); 

	        } 

	        else { 

	            System.out.println("Two arrays are not equal"); 

	        } 
	    }

}
