package Oops;

/*
 
 Encapsulation :
 	every java class is an example of encapsulation
 	process of grouping  the data members and its methods are called encapsulation
 	
 	Encapsulation = data hiding + Abstraction
 	
 
 	hiding the data behind the methods are called encapsulation , eg : getter and setter
 		- Security
 		- enhancement
 		- maintainability /modularity
 
 	Performance will be down since the no of codes will more since each time need to validate the data
 	
Tightly encapsulated class:
 	
 	- Every variable present inside the class should be private 
 	
 	
 */

public class Encapsulation {
	
	private double balance; // out side person cannot access so data hiding
	
	public double getBalance() { 
		return balance;
		
	}
	
	public void setBalance(double amount) {
		this.balance = balance+amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
