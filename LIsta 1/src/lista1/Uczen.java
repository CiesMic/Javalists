package lista1;

public class Uczen {

	private String imie;
	static int numerKursu;
	private final int rok;
	private int ocena;
	private String kolor;

	public Uczen() {
		this.imie = "Bezimienny";
		this.numerKursu = 2;
		this.rok = 2000;
		this.ocena = -1;
		this.kolor = "Czarny";
	}

	public Uczen(String imie) {
		this.rok = 0;
		this.imie = imie;
	}

	public Uczen(String imie, int ocena) {
		super();
		this.rok = 0;
		this.imie = imie;
		this.ocena = ocena;
	}

	public Uczen(String imie, int ocena, String kolor, int rok) {
		super();
		this.rok = rok;
		this.imie = imie;
		this.ocena = ocena;
		this.kolor = kolor;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public int getNumerKursu() {
		return numerKursu;
	}

	public void setNumerKursu(int numerKursu) {
		this.numerKursu = numerKursu;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		if (ocena > 0 && ocena < 6) {
			this.ocena = ocena;
		} else {
			this.ocena = -1;
		}
	}

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	public int getRok() {
		return rok;
	}
}
