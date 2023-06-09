package polymorphism;
 
public class Pass2para {
/*	static void Add(int a,int b) {System.out.println("int int result");};
	static void Add(byte a,int b) {System.out.println("byte int result");};
	static void Add(byte a,long b) {System.out.println("(byte long  result");};
	static void Add(byte a,byte b) {System.out.println("(byte byte  result");};
	static void Add(Integer a, int b) {System.out.println("Integer  int result");};
	static void Add(int a,Integer b) {System.out.println("int Integer result");};
	static void Add(char a,char b) {System.out.println("char char result");};
	static void Add(Integer a,float b) {System.out.println("Integer long result");};
	static void Add(long a,float b) {System.out.println("long  float  result");};
	static void Add(Short a,long b) {System.out.println("Short long result");};
	static void Add(Byte a,Byte b) {System.out.println("Byte Byte result");};
	static void Add(float a,long b) {System.out.println("float long result");};
	static void Add(long a,double b) {System.out.println("long double result");};
	static void Add(Float a,int b) {System.out.println("Float int result");};
	static void Add(Integer a,double b) {System.out.println("Integer double result");};
	static void Add(Long a,Long b) {System.out.println("Long Long result");};
	static void Add(Byte a,long b) {System.out.println("Byte long result");};
	static void Add(int a,Short b) {System.out.println("int Short result");};
	static void Add(Float a,Double b) {System.out.println("float  Double result");};
*/
	static void Add(Number a,byte b) {System.out.println("Number wrc long result");};
	static void Add(Number a,Number b) {System.out.println("Number wrc long result");};
	static void Add(Object a,Object b) {System.out.println("object Object  result");};
	static void Add(Byte a,byte b) {System.out.println("Number wrc int result");};

	public static void main(String[] args) {
		byte x=10;
		byte y=15;
		//Add(x,y);
	}


}
