package List6;

public class Mieszaniec extends Pies {

	String imie;
	int wiek;
	boolean zyje;
	int ile_konczyn;
	int maxwiek;
	String rasa;
	
	public Mieszaniec(){
		imie = "Imie";
		wiek = 18;
		zyje = false;
		ile_konczyn = 4;
		rasa = "Mieszaniec";
	}
	
	public Mieszaniec(String imie, int wiek, int ile_konczyn, boolean zyje, int maxwiek, String rasa){
		super(imie,wiek,ile_konczyn,zyje);
		this.maxwiek = maxwiek;
		this.rasa = rasa;
	}

	public void info()
	{
		super.info();
		System.out.println("MaxWiek: " + maxWiek());
		System.out.println("Rasa: " + rasa(rasa));
	}
	@Override
	public int maxWiek() {
		return maxwiek;
	}
	
	public String rasa(String rasa) {
		return "Ma rasê " + rasa;
	}
	
}
