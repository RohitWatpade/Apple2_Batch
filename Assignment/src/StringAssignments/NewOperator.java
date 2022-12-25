package StringAssignments;
//1.String create with “” and with new operator
public class NewOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = new String("test");
		String b = new String("test");
		String x = "test";
		String y = "test";
		// Deliberately using == rather than equals, to check reference equality
		System.out.println(a == b); // false
		System.out.println(a == x); // false
		System.out.println(x == y); // true
	}

}
