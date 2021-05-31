package application;

public class domenaException extends Exception {

	String email;
	
	domenaException(String email)
	{
		this.email = email;
	}
	@Override
	public String getMessage() {
		return email + " - brak lub nieprawidlowa domena";
	}

}
