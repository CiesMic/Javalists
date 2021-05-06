package List6;

public class Rekin extends Zwierze implements Wodne{

	String imie;
	int wiek;
	boolean zyje;
	int ile_pletw;
	
	public Rekin() {
		imie = "Imie";
		wiek = 20;
		zyje = true;
		ile_pletw = 4;
	}
	
	public Rekin(String imie, int wiek, int ile_pletw, boolean zyje)
	{
		this.imie = imie;
		this.wiek = wiek;
		this.ile_pletw = ile_pletw;
		this.zyje = zyje;
	}
	
	public void info()
	{
		System.out.println("Imie: " + imie);
		System.out.println("Wiek: " + wiek);
		System.out.println("Czy zyje: " + zyje());
		System.out.println("Ile pletw: " + ile_pletw());
	}
	@Override
	public boolean zyje() {
		return zyje;
	}

	@Override
	public int maxWiek() {
		return 20;
	}

	@Override
	public int ile_pletw() {
		return ile_pletw;
	}

}
