package polymorphism;

/* it happens in single class 
 * it is also called as compile time polymorphisem or static binding or early binding
 * it is when inclass the method name is same and paramerter are diff parameter 
 *      should be diff is one of 3 ways below
 *      1}--Number off parameter
 *      2}--data type parameter 
 *      3}--sequence of parameter
 *      
 *  Method signature =method name +parameter  must be different
 *  
 *  1.when passing primitive as parameter
 *   direct match-->>widenning-->>wrapper class-->>Number class-->>object class-->>C .E     
 *   
 *  2.when passing wrapper class object as parameter
 *    direct match-->>number class ->>object class-->auto-unboxing-->>.widnning-->>C.E
 *    
 *  3.when passing normal object as parameter (e.g-->>string) 
 *   direct match-->>parent of that class-->>Grandparent of that class-->>Object-->>C.E
 *   
 *  4. when passing null value
 *     super most child hierarchy-->>its parent-->>its frinds parent-->>object-->>C.E
 *     imp-->>when siblings are there-->>Ambiguity(C.E)
 *     
 *   when passing 2 prameter to method
 *   1.when passing both primitives as parameter
 *    both direct match-->>one widnning-->>both widnning-->>one auto boxing(when no any choice)-->>
 *    both autoboxing -->>single wrapper parent (Number)-->>both wrapper parent (Number)-->>both object   
 *      
 *     
 *     
 *     
*/


  public class Overloding {
     static void Add(int a,int b) {System.out.println("result is int int ");}	
	static void Add(byte a,int b) {System.out.println("result is byte int");}
	static void Add(byte a,byte b) {System.out.println("result is byte byte ");}
	static void Add(short b,short a) {System.out.println("result is short short ");}
	static void Add(short a,byte b,String c) {System.out.println("result is short byte");}	
	static void Add(int a,short b) {System.out.println("result is int short ");}
	static void Add(int a,byte b) {System.out.println("result is int byte ");}
	static void Add(int a,long b) {System.out.println("result is int long ");}
	static void Add(char b,byte a) {System.out.println("result is char byte ");}
	static void Add(double b,long a) {System.out.println("result is double long ");}
	static void Add(float b,int a) {System.out.println("result is float  int ");}
	static void Add(short b,long a) {System.out.println("result is short  long ");}
	static void Add(byte b,long a) {System.out.println("result is byte  long ");}
	
//	static void Add( Integer b,Long a) {System.out.println("result is Integer  Long ");}
//	static void Add( Integer b,Integer a) {System.out.println("result is Integer  Integer ");}
//	static void Add( Number b,Number a) {System.out.println("result is Number Number     int ");}
	static void Add(Number b,int a) {System.out.println("result is Number  int ");}
	static void Add(Object b,long a) {System.out.println("result is Object  long ");}

    static void Add(Object b,Object a) {System.out.println("result is Object  Object ");}
	
 public static void main(String[] args) {
	 int a=10;
	 int b=20;
         Add(null,null);
        
	} 
}
