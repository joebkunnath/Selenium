package OperatorsAndAssignments;
/*

	1 Increment and Decrement operators
	2 Arithmetic operators
	3 String concatenation operator
	4 Relational operators
	5 equality operators
	6 instanceof operator
	7 bitwise operators
	8 short circuit operators
	9 type cast operator
	10 Assignment operators
	11 conditional operator
	12 new operator
	13 [] operator
	14 operator precedence
	15 Evaluation of operands
	16 new vs newInstance()
	17 instanceof vs isInstance()
	18 classNotFoundException vs NoClassFoundError
	

1 Increment and Decrement operators:3
	Pre increment = ++x
	post increment = x++
	pre decrement = --x
	post decrement = x--
	
	| Expression || initial value of x || value of y || final value of x|
	| y = ++x    || 10   				 || 11  	   || 11              |
	| y = x++	 || 10				     || 10 		   || 11       		  |
	| y = --x    || 10 				     || 9		   || 9				  |
	| y = x--    || 10  				 || 10		   || 9				  |
	
	int x = 10;
	int y = ++10 //CE unexpected type found : value required variable
	int y = ++(++x); // CE unexpected type found value
	
	final int x= 10;
	x++ // cannot assign a value to the final variables
	
	Note:
	- We can apply increment or decrement only on variables but not for constants // CE
	- Nesting of increment and decrement operators are not allowed
	- We cannot apply increment or decrement operators for final variables
	- we cannot apply increment or decrement operators for boolean values
	- we can apply increment and decrement operators on all data types except boolean
	
	- difference between b++ and b= b+1 : 
		if we apply any arithmetic operator on variable a &b , result will be = max(int,type of A,type of B) but in the case of increment and 
		decrement operators , internal type casting will be performed automatically. b= (type of B)(b+1)
		byte a = 10
		byte b= 20
		byte c = a+b; // CE PLP fount int required byte (trying to assing 4 byte integer to 1 byte byte)
		we can solve this CE by casting
		byte c = (byte)a+b;
		byte b = 10;
		//b = (b+1); //CE PLP found: int ,required :byte
		 b = (byte)(b+1);//valid, result : 11
		System.out.println(b);
		System.out.println(b++);
		
2 Arithmetic operators:
	if we apply any arithmetic operators between two variables , result type will be always max(int, type of A, type of B)
	byte + byte = int;
	byte + short = int;
	short + short = int;
	byte + long = long;
	long + double = double
	float + long = float;
	char + char = int // 'a' + 'b' ==> 97 + 98 = 195
	char + double = double // 'a' + .89 ==> 97 + .89 = 97.89
	
	10/0 == RE arithmeticException : / by 0
	10/0.0 ==  infinity : in integral arithmetic(byte,short,int, long) there is no way to represent infinity hence 
		if infinity is result then we will get arithmetic exception in integral arithmetic
		but in floating point arithmetic there is way to represent infinity because of the class contains two classes PostiveInifinty and Negative infinity
		hence even though result is infinity we wont get any arithmetic exception in floating point arithmetic
	0/0 = RE Arithmetic exception / by 0 if the result is undefined
	0.0/0 =  NaN // NaN (not a number) will be the output if answer is undefined results from floating point arithmetic )
	
	Arithmetic exception:
	1 run time exception but not compile time error
	2 it occurs only integral arithmetic but not in floating point arithmetic
	3 the only operators which cause AE is / or %
	
String concatenation operator: (+)
	- Only overloaded operator in java is + , sometime it acts as arithmetic addition operator or string concatenation operator.

Relational operators (<, <=, >, >=):
	-we can apply relative operator on all types primitive data types except boolean
		true > false // not valid CE operator > cannot be applied to boolean
		10  > 20;
		'a' < 10;
		'a' > 97.6;
	-we cannot apply relational operators to object types:
		"durga123" > "durga" // invalid CE operator > cannot be applied to  java.lang.string
	-nesting of relational operators are not allowed
		(10<20<30);//not allowed
		
Equality operators (==, !=) :
	- we can apply relative operator on all types primitive data types
		(a == 97) //valid
		false == false
	- we can apply relational operators to object types:
	- r1 == r2 is true if r1 and r2 pointing to  same object reference 
	- if we apply equality operator on object types, then compulary there should be some relation between arguments like child to parent or vice versa or
		same type otherwise we will get CE incomparable types
		Thread t = new Thread();
		Object o = new Object();
		String s = new String();
	
		t==o; //false
		o==s; //false
		s==t; // incomparable types
		
		
Difference between == & .equals() method
	== is method for reference comparison and .equal() is for content comparison 
		eg : String s1 = new String("durga");
			 String s2 = new String("durga");
			 
			 s1==s2; // false
			 (s1.equals(s2)); true
	 in general we can use == for reference comparison(adress comparison) and .equals method for content comparison
	 
	 Note : if any object reference r, r==null; is always false. but null == null is true
	 
	 String s = new String("durga");
	 s==null; //false
	 String s = null;
	 s == null; // true
	 null == null ;// true
	 
	 
 Instanceof Operator:
 	we can use instanceof operator is to check whether the given object is of particular type or not
 	
 	Object o = l.get(o);
 	if( o instanceof Student){
 		Student s = (Student) o;
 	}
 	else if (o instanceof Customer){
 		Customer c = (Customer) o;
 	}
 	
 	r instanceof X
 	r - object reference 
 	X - class or interface name
 
 Tread t = new Thread();
 sop(t instancof Thread); true // thread is child class of runnable & object
 sop(t instancof Object); true
 sop(t instancof Runnable); true 
 sop(t instancof Thread); // CE inconvertible type - found thread , required string, 
 
 to use instanceof operator , its compulsory to have a relation between the argument types (either child to parent 
 parent to child or same type else CE inconvertible types)
 
 Note: if any class or interface X, null instanceof X is always false
 
 Bitwise operators : (&, |, ^)
 
	 & - and - returns true if both arguments are true
	 | - or - returns true if one of the argument is true
	 ^ - x-or - returns true: returns true if and only if both arguments are different NOR gate
	 
	 we can apply this operators integral types also
	 
	 sop(4&5) // 4
	 sop (4|5) // 5
	 sop(4^5) // 1 convert to bits the perform
 
 Bitwise complement operator(N) :
	 we can apply this operator only for integral types not for boolean type. if apply on boolean type then CE
	 operator N cannot applied on boolean
	 sop(N true) // CE
	 sop(N 4) // -5 :  need to convert 32 bits of the number , so positive become negative and find 2'complement
 Boolean complement operator (!):
 	- can apply on boolean types not on Integral types
 	- sop(4!) //CE oprator ! cannont apply on integral types
*/
public class OperatorsAssignments {

	public static void main(String[] args) {
		int x = 10;
		//int y = ++10; //CE unexpected type found : value required variable
		//int y = ++(++x); // CE unexpected type found value
		
		final int z= 10;
		//z++ // cannot assign a value to the final variables
		char ch = 'a';
		ch++;
		System.out.println(ch); //b
		
		double d = 10.5;
		d++;
		System.out.println(d);//11.5
		
		boolean a =true;
		 //a++;  type mismatch: cannot convert from boolean to int
		
		byte b = 10;
		//b = (b+1); //CE PLP found: int ,required :byte
		System.out.println(b);
		b++;
		System.out.println(b);
		//System.out.println(10/0); RE arithmeticException : / by 0
		System.out.println(10/0.0); //infinity
		
		String m = "joe";
		int n = 10, o= 20, p=30;
		System.out.println(m+n+o+p); //joe102030; string has more precedence 
		System.out.println(n+o+p+m); //60joe
		System.out.println(o+p+m+n); //50joe10
		System.out.println(p+m+n+o);//30joe1020
		// m = n+o+p; //invalid incompatible type
		m = m+o+p;//valid
		//n= m+o+p//invalid
		n= n+o+p; //valid
		
	}

}
