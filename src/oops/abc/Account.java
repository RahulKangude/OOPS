package oops.abc;

public class Account {

	private static double Balence;
	
	public static double getBalence() {
		System.out.println("hello");
		return Balence;
		
	}
	public void SetBalence(double balence) {
		this.Balence=balence;
	}
	
	public static void main(String[] args) {
		getBalence();
	}

}
