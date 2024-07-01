package training;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("print",10);
	}
	
	static void print(String name,int times) {
		System.out.println(times+":"+name);
		if (times>1) {
			print(name,times-1);
		}
	}

}
