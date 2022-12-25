package StringAssignments;
//2.Compare string using == when “” is present see same reference is there
public class CompareTwoString {
	 public static void main(String[] args)
	    {
	        String s1 = new String("HELLO");
	        String s2 = new String("HELLO");
	  
	        if(s1==s2)
	        {
	        System.out.println("String is Equal");
	        }
	        else
	        {
	        	System.out.println("string is not Equal");
	        }
	        System.out.println(s1.equals(s2));
	    }
}
