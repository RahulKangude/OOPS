package abstraction;

public class Main  extends Child{
   public static void main(String[] args) {
	   Main n=new Main();
       Abst m=new Abst();
	n.display();
	
	m.display1();
	 
}

public  void display1() {
		System.out.println("inside display1 method ");
}
public  void display() {
	System.out.println("inside display method ");
}

}
