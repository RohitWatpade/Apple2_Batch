import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	public  static boolean checkAnagram(String first, String second)
	{
		boolean isAnagram=false;
		if(first.length()==second.length())
		{
			char array[]=first.toCharArray();
			char array1[]=second.toCharArray();
		 	Arrays.sort(array1);
            Arrays.sort(array);
            
            //System.out.println(Arrays.toString(array));
          //  System.out.println(Arrays.toString(array1));
            
            int flag=1;
            
            for(int i=0;i<array.length;i++)
            {
            	if(array[i]!=array1[i])
            	{
            		flag=0;
            		System.out.println(isAnagram);
            		break;
            	}
            }
            if(flag==1)
            {
            	isAnagram=true;
            	System.out.println(isAnagram);
            }
			
		}
				return isAnagram;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String first=sc.next();
		String second=sc.next();
		
		Test t=new Test();
		t.checkAnagram(second, first);

	}

}
