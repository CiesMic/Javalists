package application;

public class plecException extends Exception {
	
	String plec;
	
	plecException(String plec)
	{
		this.plec = plec;
	}
	@Override
	public String getMessage() {
		return plec + " - zaznaczono nieprawidlowo";
	}

}
