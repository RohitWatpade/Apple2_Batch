package Interface;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class SamartPhone implements Mobile {
	
		public void Calling(int call)
		{
			System.out.println("Samart mobile calling vedio calls "+call);
		}

	public static void main(String[] args) {
		System.out.println("___Smart Mobile Features___");
			SamartPhone sm = new  	SamartPhone();
			sm.Calling(984554474);
			sm.Ram("2bg");
			sm.Calender("march 14");
			sm.Battery(1300 );
			sm.Fm("Smart");
			sm.camera(32);
		System.out.println("\n___Normal Mobile Features___");
	        NormalMobile n=new NormalMobile();
	        n.calling(708350);
	        n.Ram("1gb");
	        n.Calender("yes");
	        n.Battery(800);
	        n.Fm("Normal");
	}

	public void calling(int call) {
		System.out.println("Type the number fot calling"+call);
		
	}

	public void Messaging(String messege) {
		System.out.println(messege+ " Everyone");
		
	}

	public void Fm(String fm) {
		System.out.println(fm+" FM new Upgraded and Features");
		
	}

	public void Ram(String ram) {
		System.out.println("Smartl Mobilr Ram is "+ram);
		
	}

	public void Calcalator(int calculator) {
		System.out.println("Smart mobile use only normal calculator + - * / "+calculator);
		
	}

	public void Calender(String calender) {
	System.out.println("Smart Mobile not show the Festival"+calender);
		
	}

	public void Battery(int battery) {
		System.out.println("Smart mobile Battery Capacity "+battery);
		
	}
	
	public void camera(int camera) {
		System.out.println("smart mb have camera with pixel: "+camera);
	}
	


	

}
