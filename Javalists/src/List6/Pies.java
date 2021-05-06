package List6;

public class Pies extends Zwierze implements Ladowe {
	
	String imie;
	int wiek;
	boolean zyje;
	int ile_konczyn;
	
	public Pies() {
		imie = "Imie";
		wiek = 16;
		zyje = false;
		ile_konczyn = 4;
	}
	
	public Pies(String imie, int wiek, int ile_konczyn, boolean zyje)
	{
		this.imie = imie;
		this.wiek = wiek;
		this.ile_konczyn = ile_konczyn;
		this.zyje = zyje;
	}
	
	public void info()
	{
		System.out.println("Imie: " + imie);
		System.out.println("Wiek: " + wiek);
		System.out.println("Czy zyje: " + zyje());
		System.out.println("Ile konczyn: " + ile_konczyn());
	}
	@Override
	public boolean zyje() {return zyje;}
	
	@Override
	public int ile_konczyn() {return ile_konczyn;}

	@Override
	public int maxWiek() {
		return 14;
	}
}
