package Oops;

/*
AbstractClass:
	Partially implemented classes are called abstract class
	Object creation is not allowed 
	if a class contain at least one abstract method, then it is a abstract class
	We can declare abstract class even if not abstract methods are  not available
	it can be extends by child classes, then it is mandatory of initialize all the abstract methods in child class 

*/
abstract class AbstractClass {

	public abstract void m1();

	public abstract void m2();

}

class test extends AbstractClass {

	@Override
	public void m1() {
		System.out.println("implement all abstract classes");

	}

	@Override
	public void m2() {
		System.out.println("implement all abstract classes");

	}

}

abstract class test2 extends AbstractClass {

	@Override
	public void m1() {
		System.out.println("make child class as abstract");

	}

}
