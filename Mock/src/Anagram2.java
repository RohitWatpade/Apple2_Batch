import java.util.Scanner;

class Anagram2 {
	public static boolean checkAnagram(String first , String second)
	{
		boolean isanagram=false;
		
		int count=0;
		int temp;
		for(int i=0;i !=-1;i++)
		{
			if(first.indexOf(second.charAt(i))!=-1)
			{
				count ++;
			//	temp=int.toString(first.indexOf(second.charAt(i)));
				//first.replace(temp);
			}
		}
		
		return isanagram;
	}
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		String first=sc.next();
		String second=sc.next();
		
		
		System.out.println(isAnagram);
	}

}
