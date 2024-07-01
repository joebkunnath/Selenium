package Oops;

public class Accessmodifier {
	
	/*
	 
	 Public 
	 Private
	 Default
	 Protected 
	 
	 
	 Public class can be access any public methods or variable from different package by creating a object
	 Public class cannot be access any default methods or variables from different package by creating a object but can access in same package
	 Public class cannot be access any private methods or variables from different package by creating a object but can access only within the class
	 
	 Recommended modifiers for variables is private
	 Recommended modifiers for Method is public
	 
	 Protected - any child methods with in the same package can be used for any methods or variables but not in outside the packages
	 protected method can be accessed from public class from different package if it is a child class and by using child class reference // inheritance 
	 
	 Visibility          			|| Public  || Protected  || default || Private||
	 within same class  		    || yes     || yes        || yes     || yes    ||
	 Child class of same package	|| yes     || yes        || yes		|| No	  ||
	 non child class of same package|| yes     || yes        || yes     || No	  ||
	 child class from diff package  || yes	   || yes *      || No		|| NO	  ||
	 non child class of diff package|| yes     || No         || No      || NO     ||
	 
	 * - only by using child object reference 
  
	 private < default < protected < public
	 
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
