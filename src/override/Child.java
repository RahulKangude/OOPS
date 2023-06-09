package override;

import java.io.IOException;

public class Child extends Parent {
	//Overriding
	/* 1. when you are not satisfiy with the parent class logic you can write your
          own logic in child class,this concept is called as overriding.
       2.overriding always happens in chlid-parent relatin.
       3.it is also called as run-time polymorphism or dynamic binding or late binding.
       4. method signature must be same in overriding.

     #Rule of overriding
      1.Method calling resolution Rule.
       A.Compile time check-->>the method should be present at compile time in the class of reference.
       B. Run time method call -->>whose object that method will be called at run time.

      2.Rule of return type 
       A.for primitives type return type, it must be same in both classes method.
       B.for class/object type return type
         -->>till java 1.4-->>it must be same in both classes.
         -->>form 1.5------->>co-varient RT-->>if a parent class method has 'X'RT,then child method 
                                               can have 'X'or any of its child as RT.        
     3.Rule of Acess modifiers
       -->> the scope of acess modifier must not be reduce in chlid class
            (scope should be same child-parent)   
     4.rule of non-Acess modifie
       -->> final -->one way
            static-->>method hiding l
            Abstract-->> both way
            synchronized-->>both way
            strictfp ----->.both way
            native-------->>both way
            
      5.rule of exception 
      > generally for this rule is important for "checked exception".
      >A.if you throw any checked exception in parent class method, then
         child class method can throw-->>
         1.No Exception
         2.same checked Exception  
         3.child of checked exception 
         4.any un-checked exception
         5.Not allow:parent or sibling of that checked exception.
         
      >B.if you throw any un-checked exception in parent  class method then,
         child class method can throw-->>
        1.No exception
        2.same un-checked exception 
        3.Any un-checked exception(un-checked parent or sibling or all errors)
        4.Not Allowed: any checked exception 
        
      >C. if you skip throw clause in parent class method ,then
          child class method can throw-->>
        1.no exception 
        2.Any un-checked exception or error
        3.Not Allowed :any checked exception 
               
	 */
	
	
	  Byte m1(int... x)  {
		System.out.println("child m1 method");
		return 12;
	}

	// static public void m2() { System.out.println("child m2 method");}
	public static void main(String[] args) throws IOException {
		Parent c = new Parent();
		Child o = new Child();
		 Parent c1=new Child();
//		 c.m1();
	 c1.m1();
	}
}

class Parent {

  	  Object m1(int... x)   {
		System.out.println("parent m1 method");
		return 1;
	}

	// protected static void m2() { System.out.println("parent m2 method");}

}