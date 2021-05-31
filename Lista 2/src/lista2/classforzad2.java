package lista2;

public class classforzad2 {

	private int a;
	private int b;
	private String znak;

	public classforzad2() {
		this.a = 1;
		this.b = 1;
		this.znak = "0";
	}
	
	public classforzad2(int a, int b, String znak) {
		this.a = a;
		this.b = b;
		this.znak = znak;
	}

	public int getresult() {
		switch (znak) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		}
		return -1;
	}
}
