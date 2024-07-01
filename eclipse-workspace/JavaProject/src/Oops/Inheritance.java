package Oops;

/*
 
 Inheritance: 
  - is A relationship
  - code reusability
  - extends keyword
  
  
  										object
  		|			|			|		 |					|
	String    StringBuffer     NUmber   Math      	  throwable
													/			\
												Exception       Error
											  /		\				\
											RE    IO exception		VM Error
	
											
	1 Single Inheritance :
		One parent class and one child class
  	2 Multiple inheritance :
  		Multiple parents for one child class - but java not support it because of diamond access problem 
  		interface can perform multiple inheritance since only methods declaration present
  	3 Multilevel inheritance:
  		class A -- Class B extends A-- class C extends B
  	4 Hierarchical inheritance 
  		one  parent class extends by multiple child classes
  		class B extends A-- Class C extends A-- class C extends A
	5 Hybrid inheritance:
		Using the different types inheritance sim but not supported in java
	6 Cyclic inheritance : A extends A , java will not support
		
	When class extends a class, then it is a in direct child of object class	
 */


class Inheritance {
	
	public void m1() {
		System.out.println("parent method");
	}

}

class Child extends Inheritance {
	
	public void m2() {
		System.out.println("child method");
	}

}


 class retest {
	
	public static void main (String[] args){
		
		Child c = new Child();
		c.m1();
		c.m2();
		
		Inheritance I = new Inheritance();
		I.m1();
//		I.m2(); parent object could not access child class method
		
		Inheritance I1 = new Child();
		I1.m1();
//		I1.m2(); parent object could not access child class method
		
//		Child CC  = new Inheritance(); child reference cannot use it for parent object
	}

}
