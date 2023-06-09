package polymorphism;

public class Practise {
////	static void Add(int a,int b) {System.out.println("int int result");};
//	static void Add(byte a,int b) {System.out.println("byte int result");};
//	static void Add(byte a,long b) {System.out.println("(byte long  result");};
//	static void Add(byte a,byte b) {System.out.println("(byte byte  result");};
////	static void Add(Integer a, int b) {System.out.println("Integer  int result");};
////	static void Add(int a,Integer b) {System.out.println("int Integer result");};
//	static void Add(char a,char b) {System.out.println("char char result");};
////	static void Add(Integer a,float b) {System.out.println("Integer float result");};
	static void Add(long a,float b) {System.out.println("long  float  result");};
	static void Add(Short a,long b) {System.out.println("Short long result");};
	static void Add(Byte a,Byte b) {System.out.println("Byte Byte result");};
	static void Add(int a,Byte b) {System.out.println("int Byte result");};

	public static void main(String[] args) {
		int a=10;
		int b=15;
       Add(a,b);
	}

}
