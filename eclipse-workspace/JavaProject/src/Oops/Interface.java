package Oops;
/*
  
 Interface: 
 	- Any service requirement specification 
 	- Any contract between client and service provider
 	- every method in interface is abstract and public (100 % percentage pure abstract class till 1.7v)
 	- default methods and static methods are allowed from java 1.8 v
 	- private methods also allowed from java 1.9v
  
  
  
  - Difference between Interface and Abstract class
 
class Student
{	
	String name;
	int rollNo;
	
	Student(String name, int rollNo) //constructor
	{
		this.name = name;
		this.rollNo = rollNo;
	}
}
	
	Student s = new Student("joe",101);
	
	new - responsible for create an object
	student("joe",101) - is for Initialized the object using constructor

Purpose of constructor :
	To initialize an object
	whenever we are creating an object after object creation automatically constructor will be executed to initialize the object
What is the purpose of parent constructor:
	Whenever we are creating child class object, automatically parent constructor will be executed to perform initialization
	for the instance variables which are inheriting from parent . so parent object will not be created
	
	class Person
	{
		String name;
		int age;
		
		Student(String name, int age) //constructor
		{
			this.name = name;
			this.age = age;
		}
	}
	
	class Student extends Person
	{	
		
		int rollNo;
		int marks
		
		Student(String name, int age,int rollNo, int marks) //constructor
		{
			super(name,age);
			this.rollNo = rollNo;
			this.marks = marks;
		}
	}
	
	Student s = new Student("joe",20,101,99);
	
	name= joe // parent constructor
	age = 20 // parent constructor
	rollno = 101 // child constructor
	marks = 99 // child constructor
*/
public interface Interface {
	
	public void m1();
	public void m2();

}
