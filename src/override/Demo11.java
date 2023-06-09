package override;

class RK {
	static public void m1() {
		System.out.println("parent method");
	}
}

public class Demo11 extends RK {

	public static void main(String[] args) {
		RK d = new Demo11();
		d.m1();

	}

	static public void m1() {
		System.out.println("child method");
	}

}
