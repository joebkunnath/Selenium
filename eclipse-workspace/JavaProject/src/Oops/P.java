package Oops;

class P {
	
	String s = "parent";
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
class D extends P {
	String s = "child";
//	public void m1() { //cannot override because
//
//	}
//
//	public static void m2() { //cannot override because
//
//	}
	public static void m3() {  //This is not overriding , it is method hiding
		System.out.println("child method");
	}
	public void m4() {

	}
	
	

}
