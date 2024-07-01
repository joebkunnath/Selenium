/*
Main method:
	Whether class contains main method or not , and main method is declared or not , these things wont we checked by compiler 
	at run time jvm responsible to check these things. if jvm unable to find the main method, then we get run time exception saying 
	NoSuchmethoderror :main
	At runtime jvm always search for main method with the following prototype
	
	Public - to call by jvm from anywhere
	static - without existing the object also jvm has to call the this method
	void - main method wont return anything to jvm 
	main - this the name configured inside jvm
	String[] args - command line arguments

	any changes to the above syntax will get runtime exception is Nosuchmethod but some exceptions to the order
	
		order of modifiers are not important 
		String[] args can perform in any acceptable format - String []args or String args[] or String... args
		args can be replaced with any other name
	
	Case 1 : overloading of main method is possible but jvm will always call string array argument main method only
			 the other overloaded method need to call explicitly
			 
 	Case 2 : inheritance method is applicable is for child class, if child doesnt contain main method then parent class main method
 	 		  will be executed
    Case 3 : if the child and parent class have the same main methods, method hiding will take place(not method overriding)
    			for main method, inheritance and overloading concepts are applicable but not overriding. 
		
	Java 1.7 version changes:
		error message changed if the main method is not present inside the class as 
		Error: main method not found in class , please define main method (instead of NoSuchMethoderror)
		main method is mandatory from 1.7v 
 	 		  
 	 		
 */
public class MainMethod {

	static public final synchronized strictfp void main(String... joe) {
		System.out.println("main");
		main(10);

	}
	
	static public void main(int... joe) {
		System.out.println("main-int");

	}

}
