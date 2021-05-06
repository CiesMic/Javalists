package List6;

public class Husky extends Pies{
	
	String imie;
	int wiek;
	boolean zyje;
	int ile_konczyn;
	int maxwiek;
	String rasa;
	
	public Husky(){
		imie = "Imie";
		wiek = 16;
		zyje = false;
		ile_konczyn = 4;
		rasa = "Husky";
	}
	
	public Husky(String imie, int wiek, int ile_konczyn, boolean zyje, int maxwiek, String rasa){
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
