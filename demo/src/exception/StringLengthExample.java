package exception;

public class StringLengthExample {


		int getStringLength(String s) throws NullPointerException /// halt your program exception called method
		{
			return s.length();
		}
		void stringOperation(String s)
		{
			System.out.println(getStringLength(s));
			System.out.println(s.toLowerCase());
			System.out.println(s.toUpperCase());
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StringLengthExample s1= new StringLengthExample();
			s1.stringOperation("Mumbai");
			s1.stringOperation("Java");
			s1.stringOperation(null);
			s1.stringOperation("India");
			s1.stringOperation("Language");

	}

}
