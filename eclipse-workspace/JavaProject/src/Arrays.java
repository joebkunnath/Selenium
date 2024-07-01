/* 
 Arrays
 	1 introduction: Array is an indexed collection of fixed number of homogeneous data elements
 		- arrays are fixed in size
 		- arrays can add only homogeneous data elements
 		- we can represent a huge number of values using single variable so that readability 
 		  of the code is improved
 		  
 	2 Array declaration :
 	 	- 1 Dimensional declaration:
	 	 	int[] x; 
	 	 	int []x;
	 	 	int x[];
 	 	- 2 Dimensional declaration:
 	 		int[][] x;
 	 		int [][]x;
 	 		int x[][];
 	 		int[] []x;
 	 		int []x[];
 	 		
 	 		int[] a,b;
 	 		int[] a[],b;
 	 		int[] a[],b[];
 	 		int[] []a,b;
 	 		int[] []a,b[];
 	 		int[] []a,[]b; //invalid because ignore space is only available for first variable
 	 		
 		- 3 Dimensional declaration:
			int[][][] a;
			int [][][]a;
			int[] [][]a
			int[][] []a;
			int[][] a[];
 		
 		
 	3 Array creation:
 	 	- Every array in java is an object hence we can create are array by using new operator
 	 	- Every array have a class associated to java.lang package which is not available in programming level
 	 	
 			int[] a = new int[3];
 			a.getClass().getName(); // [I
 			
		Loopholes:
 			1. at the time of array creation its compulsory to mention the size else CE
 				int[] x = new int[0];
 			2. if we are trying to specify array size with negative int value we get runtime exception says NegativeArraySizeexception
 				int[] x = new int[-3];
 			3. byte,short,char are values are allowed as index value for array length, for other type get CE P L P
 				int[] x= new int['a'] // take unicode of a is 97
			4. if the array size of an int array should not be more than int  size as 2147483647, if it exceeds then CE 
				-Integer is too large eg int[] x = new int[2147483648];
				note : there may get runtimeException if sufficient heap memory not available. int[] x = new int[2147483647];
		2 dimensional array creation:
				
			in java 2 D array not implemented using matrix style, sun people followed array of arrays approach for multidimensional 
			array creation. the main advantage is memory utilization will be improved	
			eg:
			1.  int[][] x = new int[2][];
				x[0] = new int[2];
				x[1] = new int[3];
			
			2.	int[][][] x = new int[2][][];
				x[0] = new int[3][];
				x[0][0] = new int[1];
				x[0][1] = new int[2];
				x[0][2] = new int[3];
				x[1] = new int[2][2];
				
				
 	4 Array initialization:
 		int[] x = new int[3];
 		System.out.println(x);// [I@hashcode] 
 		sytem.out.println(x[0]; // return 0 because every array initialized with default values.
 		
 		Note: any reference variable will call toString internally to return the string in the form of classname@hashcode in hexadecimal form
 		
 		int[][] x = new int[2][3];
 		sop(x); // [[I@hashcode]
 		sop(x[0]); // [I@hashcode] it become an variable to store the reference
 		sop(x[0][0]); // 0
 		
 		int[][] x = new int[2][]
 		sop(x); // [[I@hashcode]
 		sop(x[0]); // null
 		sop(x[0][0]); // null pointer exception
 		note: if we are trying to perform any operation on null we will get NPE
 		
 		int[] x  = new int[3];
 		int[3] or int[-3] = 30;//ArrayIndexOutofboundsException
 		
 		int[2.5] = 20; // PLP
 		
 	5 Array declaration, creation and initialization in single line
 		int[] x = {10,20,30};// 1D
 		int[][] x = {{10,20},{30,40,50}}; //2D
 		int[][][] x = {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}}; //3D
 		
 		int[] x; // valid
 		x={10,20,30}; //CE illegal start of expression
 		
 	6 length vs length()
 		length: 
 		int[] x = new int[6];
 		sop(x.length()); // CE cannot find the symbol 
 		sop(x.length) // 6 -length is a final variable applicable for arrays
 		
 		String s = "joe"
 		sop(s.length); // CE cannot find the symbol
 		sop(s.length()); // 3
 		
 		length() present in String class which is final class , so it is final method 
 		
 		String[] s = {"A","AA","AAA"}
 		sop(s.length) ;// 3
 		sop(s.lenth()); CE cannot find symbol because it is an array
 		sop(s[0].length) ;// CE cannot find symbol because it is string
 		sop(s[0].length()); 1
 		
 		int[][] x = new int[6][3];
 		sop (x.lenth); // 6 in multi dimensional array length represent only base size not total size
 		sop(x[0].length) // 3
 		
 	7 Anonymous Arrays
 		An array declared without name is called anonymous array. 
 		
 		public class Arrays {

			public static void main(String[] args) {
				
				sum(new int[]{10,20,30});// declaration on anonymous array
				sum(new int[]{{10,20,30},{15,40}})
			}
			
			public static void sum(int[] x){
				int total = 0;
				for(x1:x){
					total = total +x1;
				}
				sop(total);
		}	
 		
 	8 Array element assignments
 		int[] x = new int[5];
 		x[0] = 10;
 		x[1] = 'a'; // hashcode value of will be stored
 		byte b = 20;
 		x[2]= b;
 		short s = 30;
 		x[3] = s;
 		x[4]= 10l; //CE PLP
 	
 	 	float arrays allowed data types are byte,short,char,int,long,float
 	
 		object[] a = new object[10];
 		a[0] = new object();
 		a[1] = new String("joe"); // valid
 		a[2] = new Integer(100); //valid
 	
 		Runnable[] r = new Runnable[];// Valid because interface type object can be created
 		r[0] = new Thread(); //valid because thread is implementation class of runnable interface
 		
 	9 Array variable assignments 
 	
 	int[] a = {10,20,30};
 	char[] ch = {'q','a','z'};
 	
 	
 	int[] b = a; //valid
 	int[] c = ch;// CE incompatible type because element level promotion are not applicable at array level 
  
  	String[] s = {"a","aa","aaa"};
  	object ob = s; //valid 
  	
  	int[] x = {10,20,30};
  	int[] y = {40,50};
  	
  	x= y or y=x are valid because reference variable will updated not the internal elements
  	whenever we assign one array to another array
  		array dimensional should be matched, 
  		data types should be matched
  		but size is not required to match
  		
  		int[][] a = new int[4][3];
  		a[0] = new int[4];
  		a[1] = new int[2];
  		a = new int[3][2]; // valid, new array will be created and old one will available for GC
 */
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
