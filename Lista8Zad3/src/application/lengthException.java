package application;

public class lengthException extends Exception{
	
	String name;
	
	lengthException(String name)
	{
		this.name = name;
	}
	@Override
	public String getMessage() {
		return "Twoj  " +name+ " jest za krotki";
	}

}
