package application;

public class NumberException extends Exception{
	
	String name;
	
	NumberException(String name)
	{
		this.name = name;
	}
	@Override
	public String getMessage() {
		return "Twoj " + name + " nie ma liczby";
	}

}
