package List6;

public class Mako extends Rekin{

	String imie;
	int wiek;
	boolean zyje;
	int ile_konczyn;
	int maxwiek;
	
	public Mako(){
		imie = "Imie";
		wiek = 16;
		zyje = false;
		ile_konczyn = 4;
	}
	
	public Mako(String imie, int wiek, int ile_pletw, boolean zyje, int maxwiek){
		super(imie,wiek,ile_pletw,zyje);
		this.maxwiek = maxwiek;
	}

	public void info()
	{
		super.info();
		System.out.println("MaxWiek: " + maxWiek());
	}
}
