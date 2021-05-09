package List6;

public class Main {

	public static void main(String[] args) {
		
		Pies zw = new Husky("Azor",11,4,true,20, "Husky");
		Rekin rek = new Mako("Maciek", 21, 2, true, 30);
		
		Zwierze z = new Husky();
		((Husky)z).rasa("rasa");
		rek.info();
		zw.info();	
	}
}
