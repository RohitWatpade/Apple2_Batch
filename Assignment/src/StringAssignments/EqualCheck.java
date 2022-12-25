package StringAssignments;
//6.Write a Java program to compare two strings.
	public class EqualCheck {
	    public static void main(String args[]){
	        String a = "AVATAR";
	        String b = "avatar";

	        if(a.equals(b)){
	            System.out.println("Both strings are equal.");
	        } else {
	            System.out.println("Both strings are not equal.");
	        }

	        if(a.equalsIgnoreCase(b)){
	            System.out.println("Both strings are equal.");
	        } else {
	            System.out.println("Both strings are not equal.");
	        }
	    }
	}


