package polymorphism;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class  Parent{
   
	  
}
class Parent1 extends Parent{
	
}

public class Practise1  {
	public static void main(String[] args) throws Exception {
		Practise1 P=new Practise1();
		Parent a=new Parent1();
		P.m1(a);
	}
		public void m1(Parent a) {
			System.out.println("inside parent");
		}
         public void m1(Parent1 a) {
        	 System.out.println("inside parent1");
		}
		
		
		
//		Practise1 p=new Practise1();
//		Parent p1=new Practise1();
//	      p1.m1();
//	}
//	static  void m1() throws NullPointerException
//	 {
//		  System.out.println("inside Child method");
 // }
	
}
