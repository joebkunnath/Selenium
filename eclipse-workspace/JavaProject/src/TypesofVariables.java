
/*
 Types of variables :
 
 all variable are dived into two type
 	1. Primitive variables : can be used to represent primitive values
 		int x = 10;
 	
 	2. reference variables can be used to refer objects
  	Student s = new Student();

  Division 2: based on the position of declaration and behavior, all variables are again divided into 3
  	1. Instance variables
  	2. static variables
  	3. Local variables
  
  
  Instance variables : 
  	1. If the value of the object variable is varied from object to objects, such types of variable are called instance variable
  	2. A separate copy of instance variable will be created
  	3. Instance variable should declared within the class directly but out side of any method or block or constructor 
  	4. Instance variable will be created at time of object creations and destroyed when objected is destroyed hence scope of instance
  	   variable is exactly same as scope of object.
  	5. Instance variable is stored in Heap memory as part of object
  	6. we cannot access instance variable inside static method but can use inside of instance method
  	7. JVM will always provide default values and not required to perform initialization explicitly 
  	8. Instance variable is also known as Object level variable or attributes 
  	
  Static variables:
  	1. If the value of the variable in not vary from object to object, such types of variable is not recommended as instance variable
  		we have to declare such type at class level by using Static modifier 
    2. In the case of static variable , a single copy will be created at class level and shared by every object of the class. 
    3. Static variable should be declared within the class directly but inside of any method or block or constructor
    4. Static variable will be created at the time of class loading and destroyed at the time of class unloading 
    	hence scope of static variable is exactly same as scope .class file
    	
    	when you call a Java Test
    		1 start JVM
    		2 Create and start main thread
    		3 locate Test.Class file
    		4 load Test.class
    		5 Execute main method
    		6 Unload Test.class file
    		7 Terminate main thread
    		8 Shutdown JVM
    		
    5. Static variable will created at the time of loading Test.class file and destroyed when unloading the Test.class file
    6. Static variables will be stored in Method area
    7. Static variable can be accessed either by object reference or class name, but recommend to to use class name. 
       With in the same class it is not required to use class and we can use directly
    8. We can access static variable from both instance and static area.
    9. JVM will provide default values and we are not required to perform initialization explicitly.
    10. static variable are also called class level variables or fields
    11. static variable value will be changed when ever the value is modified inside the methods
  
  3. Local variables:
  		1 The variable which are declared inside the method or block or constructor 
  		2 also called temporary variable or stack variable  or automatic variable
  		3 local variable will stored inside stack memory area
  		4 local variable are thread safe
  		5 local variable will be created while executing the block in which we declared it. once block execution is complete , 
  		  local variable will be destroyed hence scope of local variable is is the block in which we declared it
  		6 JVM wont provide default values, compulsory we should perform initialization explicitly before using the variable 
  		7 only applicable modifier is final, rest all are not applicable and if used then get CE  illegal start of expression
  			Public, protected,private,static,transient,volatile x = 10;
  		
  		note: if we are not declaring with any modifier then by default it is default but this rule is applicable only for instance 
  		and static variable but not for local variables
  			
  		Conclusions :
  		1	For instance and static variables JVM will provide default value and we are not required to perform initialization explicitly
  			but for local variables JVM wont give default values and we should perform initialization explicitly before using the variable
  		2	Instance and static variables can be accessed by multiple threads simultaneously hence these are not thread safe 
  			but in case local variables for every thread a separate copy will created, hence local variables are thread safe.
  		3 every variable in java should be 
  				- instance or static or local
  				- primitive or reference(object)
  		
		instance level
			  		int[] x;
			  		
			  		class t = new class();
			  		sop(t.x); // null
			  		sop(t.x(0); // NPE
			  		
					int[] x = new int[3];
			  		
			  		class t = new class();
			  		sop(t.x); // [I@hashcode
			  		sop(t.x(0); // 0
  				
		Static level
  		
			  			static int[] x;
			  		class t = new class();
			  		sop(t.x); // null
			  		sop(t.x(0); // NPE
			  		
					static int[] x = new int[3];
			  		
			  		class t = new class();
			  		sop(t.x); // [I@hashcode - pointing to array
			  		sop(t.x(0); // 0 pointing to element so array property will provide default value
  		
  		local level
  		
			  		 int[] x;
			  		class t = new class();
			  		sop(t.x); // CE variable x might not been initialized
			  		sop(t.x(0); // CE variable x might not been initialized
			  		
				    int[] x = new int[3];
			  		
			  		class t = new class();
			  		sop(t.x); // [I@hashcode - pointing to array
			  		sop(t.x(0); // 0 pointing to element so array property will provide default value
 */


public class TypesofVariables {
	
	String name = "joe"; //instance variable
  	int rollNo; //instance variable
  	double y;
  	boolean z; // false
  	String a; //null
  	static String collage = "abc";
  	static String city;
  	
	public static void main(String[] args) {
		
		//System.out.println(name); CE non static variable name cannot be reference from static context.
		TypesofVariables t = new TypesofVariables();
		System.out.println(t.name); // object is created so instance variable can be used
		System.out.println(t.y); //jvm will provide default value as 0.0 
		System.out.println(t.collage); //not  recommended 
		System.out.println(TypesofVariables.collage); // recommended way
		System.out.println(collage);// can use directly if it is in the same class
		int i = 0;
		int k; //will not through any error until it is used. if used then CE variable k might not have been initialized
		for(int j=0;j<3;j++) {
			i = i+j; // j is local variable
			System.out.println(i+"..."+j); //valid , j is available
		}
		//System.out.println(i+"..."+j); CE - cannot find the symbol
		
	}
	
	
	public void m1() { // instance method since there is no static
		System.out.println(name); // we can access instance variable in instance method
		System.out.println(collage);
		System.out.println(city);// null not initialized but jvm assigned default value as null
	}

}
