/*
Java Coding standards:
	- Start with package name 
	- name of the class should be public and meaningful names
	- use modifiers if method is not instance method
	- use proper names for method
	- use proper name for arguments 

Class: eg String, StringBuilder..
	- nouns
	- Starts with Upper case character  and every inner word start with upper case if contains multiple words

Interface:Runnable , Comparable 
	- Adjectives
	- Starts with Upper case character  and every inner word start with upper case if contains multiple words

Methods: print(),sleep(),run(), getName()
	- Verbs or verb-noun combination
	- Starts with lower case character  and every inner word start with upper case if contains multiple words(camel case convention)

Variables :eg: name,age,salary,mobileNumber
	- nouns
	- Starts with lower case character  and every inner word start with upper case if contains multiple words(camel case convention)
	
Constants: eg: MAX_VALUE,MAX_PRIORITY,NORM_PRIORITY,PI
	- nouns
	- only upper case character and every inner word separated with underscore symbol(_) if contains multiple words	
	- usually we can declare constants with public static final modifiers
	
Java Bean coding standards:
	- A java bean is simple java class with private variables and getter and setter methods
	
	eg:
	public class StudentBean
	{
		private String name;
		public void setName(String Name)
		{
		this.name = name;
		}
		public String getName()
		{
		return name;
		}
	}
	
	Syntax for setter method:
		- should be public
		- return type should be void
		- method name should start with set
		- should take some argument , ie, it should not be no argument method
	
	syntax for getter method:
		- should be public
		- return type should not be void
		- method name should start/prefix with get or is
		- should not take some argument.
		note: method name can be prefixed with "is" if method is return boolean based on more meaningful full name

Listeners : 8 listeners 
	- listens events and perform appropriate actions if any events occurs
	
	Case1 : to register a listener:
		- should be public
		- should return void
		- method name prefixed with add  and whatever comes next should pass inside the method
		
		public void addMyActionListener(MyActionListener l)  //valid
		public void registerMyActionListener(MyActionListener l) //invalid
		public void addMyActionListener(ActionListener l) //invalid
	
	Case 2 : unregister a listener:
		- should be public
		- should return void
		- method name prefixed with remove  and whatever comes next should pass inside the method
		
		public void removeMyActionListener(MyActionListener l)  //valid
		public void registerMyActionListener(MyActionListener l) //invalid
		public void removeMyActionListener(ActionListener l) //invalid
 */


public class JavaCodingStandards {

	private static final String MAX_VALUE = null;
	private static  String name;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		JavaCodingStandards.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
