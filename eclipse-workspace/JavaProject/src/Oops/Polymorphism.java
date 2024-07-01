package Oops;

/*
 Method Signature:
 	method name followed by types
 	
 	public int m1(int i, float f); ==> m1(int,float)
 	
 Overloading :
 	method names are same but arguments are different
 	more flexibility to code
 	method resolution always taken care by complier based on reference type not based on runtime object
 	Also called compile time Polymorphism or static polymorphism or early binding
 
 Overriding :
 	if the both parent and child has same method names, child can override the parent method
 	method resolution always taken care by jvm based on based on runtime object not on reference type
 	complier will check for method present in parent but jvm will override and execute child class method
 	Run time polymorphism or Dynamic polymorphism or late binding - always preference to child class method
 
 	Conditions for overriding:
 		1 method names and arguments type must be same (method signature)
 		2 return type should be same but can return co-varient values from 1.5 v on wards(co-varient = child class of objects)
 			Object == string or stringBuffer or null are child classes of object class
 			Number == Number, Integer, Float,..Byte,short,long,double
 			co-varient return type concept only allowed objects not on primitives 
		3 overriding is not valid for private  and final  parent methods
		
			parent     final         non final 		Abstract/Non    Synchronized/non
						||				||			  ||				||
						||				||			  ||				||
			child  non final/final(X)  Final     	non /abstract	non/Sync
 		4 we can reduce the scope of access modifiers but it can increase 
 			public =/= protected ;
 			protected ==> public
 			
 			protected < default < protected < public
 		5 if child class method throws any checked exception , it is compulsory parent class should throw same exception 
 			or its parent exception	
 			
 	Overriding on variables:
 			Overriding is not possible on variables , but it is called Variable hiding or shadowing
 			variable hiding is taken care by complier so based on reference type not because of object
 			
 */
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism t = new Polymorphism();
		t.m1(10); //General method(1.0v) vs var-arg method(1.5v)- old has more preference
		t.m1(10.5f);
		t.m1('a'); // automatic promotion
		t.m1(10l); // automatic promotion
		t.m2(new Object()); // exact match has higher priority
		t.m2("Joe");
		t.m2(null); // parent - child arguments child has the priority
		t.m3("joe-2"); //exact match
		t.m3(new StringBuffer("Joe-b"));//exact match
//		t.m3(null); // both string and string buffer are child of object class hence CE
		t.m1(); //var-arg method will get the chance
		t.m1(10,20);
		t.m4(10.5f, 10);
		t.m4(10, 10.5f);
//		t.m4(10, 10);// CE m4(int, float) is ambiguous for the type Polymorphism
//		t.m4(10.5f, 10.5f); // CE no such method
	}

	public void m1(int i) {
		System.out.println("int method executed : "+ i);
	}

	public void m1(float d) {
		System.out.println("float method executed : "+ d);
	}
	
	public void m2(Object o) {
		System.out.println("Object method executed : "+ o);
	}

	public void m2(String s) {
		System.out.println("String method executed : "+ s);
	}
	
	public void m3(String s) {
		System.out.println("String m3 method executed : "+ s);
	}
	public void m3(StringBuffer s) {
		System.out.println("StringBufer method executed : "+ s);
	}
	
	public void m1(int... i) {
		System.out.println("int... method executed : "+ i);
	}
	
	public void m4(int i,float f) {
		System.out.println("int-float method executed : "+ i +f);
	}
	
	public void m4(float f, int i) {
		System.out.println("float-int method executed : "+f +i);
	}
	



}
