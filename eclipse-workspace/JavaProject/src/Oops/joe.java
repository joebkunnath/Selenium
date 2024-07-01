package Oops;

import java.util.ArrayList;

/*
 
  A file can contain multiple classes 
  A file can contain maximum one public class then name the class should be same as public class
  you cannot call a class if it doesn't contain any main method
  
  Import:
  
  Explicit Import : import java.util.ArrayList; // recommended usage because of readability 
  Implicit Import : import java.util.*;
  
  Classes which are not required to import because it is available for all java classes
  java.lang. eg: String, Thread, Exception, StringBuffer
  default package. : current working directory 
  
  whenever we importing a package , all classes and interfaces will be available but not sub packages
  import java.*; not valid
  import java.util.regex.*; need to go down until the sub package is included
  
  Package: eg: java.sql, java.io
  
  package is an encapsulation mechanism to a group of related classes and interfaces into a single unit
  only at most one package statement is allowed in class file
  
  
  
  adv:
  naming conflicts are can be resolved if packaging is present
  modularity/Maintainability  of the application is improved
  Security for components 
  
  package statement 
  import statement
  class/interface/enum
  
  
 */


public class joe {
	public static void main(String[] args) {
		System.out.println("a class");
		java.util.ArrayList l = new java.util.ArrayList(); //called fully qualified name
		ArrayList AL = new ArrayList(); //short name
	}

}
class b {
	public static void main(String[] args) {
		System.out.println("a class");
	}

}
class c {
	public static void main(String[] args) {
		System.out.println("a class");
	}

}
