package application;

public class Student implements Comparable<Student> {
	int rocznik;
	String nazwisko;
	double avg;
	
	public Student()
	{
		this.rocznik = 1999;
		this.nazwisko = "Kowalski";
		this.avg = 2;
	}
	public Student(int rocznik, String nazwisko, double avg)
	{
		this.rocznik = rocznik;
		this.nazwisko = nazwisko;
		this.avg = avg;
	}
	@Override
	public int compareTo(Student o) {
		if(this.rocznik == o.rocznik)
		{
			if(this.avg == o.avg)
			{
				return this.nazwisko.compareTo(o.nazwisko);
			}
			else return (int)(this.avg - o.avg);
		} else return this.rocznik - o.rocznik;
	}
	@Override
	public String toString()
	{
		return "Rocznik: " + this.rocznik + " Nazwisko: " + this.nazwisko + " Srednia: " + this.avg + "\n";
	}
	
}