package Oops;

/*
 Method hiding:
 	BOth parent and child methods should be static
 	method resolution is always taken place by complier based on reference type
 	static polymorphism  or early binding
 
 
 
 */

class MethodHiding {
	public static void main(String[] arg) {
		P p = new P();
		p.m3(); // parent method
		System.out.println(p.s);
		D d = new D();
		d.m3(); // child method
		System.out.println(d.s);
		
		P p1 = new D();
		p1.m3(); //child method
		System.out.println(p.s);
	}
	
	public static void m1() {

	}
	public void m2() {

	}
	public static void m3() {
		System.out.println("Parent method");
	}
	public void m4() {

	}
}


