package polymorphism;

public class Overloading1 {
	//static void Add(String a) {System.out.println("String result");};
//	static void Add(int a) {System.out.println("int result");};
	static void Add(byte  a) {System.out.println("byte result");};
	static void Add(short a) {System.out.println("Short result");};
	static void Add(char  a) {System.out.println("char result");}; 
	static void Add(float a) {System.out.println("flaot  result");};
	static void Add(long a) {System.out.println("long result");};
	static void Add(double a) {System.out.println("double result");};
	static void Add(boolean a) {System.out.println("b result");};
	static void Add(Integer a) {System.out.println("Interger  result");};
	static void Add(Byte a) {System.out.println("Byte  result");};
	static void Add(Number a) {System.out.println("number wrc  result");};
	static void Add(Object a) {System.out.println("object result");};
	static void Add(StringBuffer a) {System.out.println("StringBuffer result");};

	public static void main(String[] args) {
		System.out.println("main method ");
		int b=110;
		Add(b);	
		
		/*int d=10;//autoboxing 
		Integer i=d;
		
		Integer i1=new Integer(10);
		int i2=i1;//auto-unboxing 
		
		float f=23.453f;
		Number n=f;*/
	}
	
}
