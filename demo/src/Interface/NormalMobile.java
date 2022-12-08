package Interface;

interface Mobile
{
	void calling(int call);
	void Messaging(String messege) ;
	void Fm(String fm);
	void Ram(String  ram);
	void Calcalator(int calculator);
	void Calender(String calender);
	void Battery(int battery);
	
}
public class NormalMobile implements Mobile {

		public void calling(int call) {
			System.out.println("Type the number fot calling"+call);
			
		}

		public void Messaging(String messege) {
			System.out.println(messege+ " Everyone");
			
		}

		public void Fm(String fm) {
			System.out.println(fm+" Fm and poor network");
			
		}

		public void Ram(String ram) {
			System.out.println("Normal Mobilr Ram is "+ram);
			
		}

		public void Calcalator(int calculator) {
			System.out.println("Normal mobile use only normal calculator + - * / "+calculator);
			
		}

		public void Calender(String calender) {
		System.out.println("Normal Mobile not show the Festival"+calender);
			
		}

		public void Battery(int battery) {
			System.out.println("Normal mobile Battery Capacity "+battery);
			
		}
		
			
		}

