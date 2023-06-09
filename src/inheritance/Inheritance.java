package inheritance;

import javax.net.ssl.HandshakeCompletedEvent;

public class Inheritance extends Jungle{
	static  void m1() {
		System.out.println("inside Inheritance class");
	}
	public static void main(String[] args) {
		Inheritance n=new Inheritance();;
		Jungle2 b=new Inheritance();;
		Jungle n1=new Jungle();
		Jungle2 n2=new Jungle();
		try {
			
			Inheritance h=(Inheritance) new Jungle();
			h.m1();
		} catch (RuntimeException e) {
			System.out.println("con't typecast ");
			//throw new NullPointerException("cannot access");
		}
		b.m1();
		n.m1();
		n2.m1();
		n1.m1();
		
	}
}
class Jungle extends Jungle2{
	static  void m1() {
		System.out.println("inside jungle class");
	}
	 
}
class Jungle2{
	static  void m1() {
		System.out.println("inside jungle2 class");
	}
	native void m2();
}