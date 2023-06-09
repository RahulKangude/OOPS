package override;

public class Parent1 {
	void m1() {
		System.out.println("parent");
	}

	public static void main(String[] args) {
		Child11 c = new Child11();
		c.m1();
		c.m2();

		 Parent1 p=new Child11();
		p.m1();
		//p.m2();
	}

}

class Child11 extends Parent1 {
	void m2() {
		System.out.println("child");
	}

}