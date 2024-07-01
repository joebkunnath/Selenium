/*
*
Var-arg methods :(variable number of argument methods ) 1.5 v
	
	
	until 1.4 version, we cannot declare a method variable no of arguments. if there is a change in no .of arguments , compulsory we should go for a new method
	and it will increases the length of code and reduce readability. to over come this problem sun people introduced Var-arg method in 1.5 version
	According to this , we can declare a method which contain variable no of arguments such type of methods are called var-arg methods
	
	we can declare var -methods as follows
	
	m1(int... x)  ==> converted to 1 D array
	
	we can call this method bypassing any no of int values including 0
			m1(0);
			m1(10);
			m1(10,20);
	
	m1(int ...x);// valid
	m1(int...x)//valid
	m1(int  x...)// invalid
	m1(int. ..x) // invalid
	
	case 2: we can mix var-arg parameter with normal parameter.
	case 3: last parameter should be var-arg parameter
	case 4: more than one var-arg parameter is not allowed
	case 5: inside a class we can't declare var-arg method and corresponding 1D array simultaneously otherwise we will get CE cannot declare both
	case 6: Var-arg method has least priority when if there an other method eligible
	
	m1(int x, int... y) //valid case 2
	m1(double... d, string s); //invalid case 3
	
	
	Equivalence between var-arg parameter & 1D array:
	where ever 1D array present we can replace with var-arg parameter
	where ever var-arg parameter is present , we cant replace with 1D array
		m1(int[] x) ==> m1(int... x)
		m1(int... x) //==>// m1(int[] x)
		
	Note: 
		m1(int... x) == int[] x ; x will become 1D array
		m1(int[]... x) == int[][] x; x will become 2D array
	
	*/
public class Var_Arg_Methods {

	public static void main(String[] args) {
		m1();
		m1(0);
		m1(10,20);
		m1(10,20,30);
		m2("joe","kunnath");
		
		int[] a = {10,20,30};
		int[] b = {30,40,50};
		m3(a,b);
		

	}
	
	public static void m1(int... x) {
		System.out.println("var-arg method-"+x.length);
		int total = 0;
		for(int x1:x) {
			total = total+x1;
		}
		
		System.out.println("sum :"+total);
	}
	
	public static void m3(int[]... x) {
		System.out.println("var-arg method-int[]");
		
		for(int[] x1:x) {
			for(int i=0;i<x1.length;i++) {
				System.out.println("element-"+x1[i]);
			}
			
		}
		
		
	}
	public static void m1(int x) {
		System.out.println("general method");
	}
	
	public static void m2(String... x) {
		String total="";
		for(String x1:x) {
			total = total+x1;
		}
		
		System.out.println("sum :"+total);
	}

}
