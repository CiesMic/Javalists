package application;

public class UpperNumberException extends Exception {
	
	String name;
	
	UpperNumberException(String name)
	{
		this.name = name;
	}
	@Override
	public String getMessage() {
		return "Twoje "+name+" nie ma duzej litery lub ma inne znaki niz litery";
	}


}
