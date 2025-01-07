package day1;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50;
		//the value saved in x is : 50
		System.out.println("the value saved in x is : "+x);
		
		double y = 3.14;
		System.out.println(y);
		
		boolean z = false;   //true/false
		
		int a = 100;
		int b = 89;
		System.out.println(a+b);
		System.out.println("hello"+a+b);			//hello1089  
		System.out.println(a+b+"hello");			//99hello
		

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);			//1   integer number operates with integer number, the result is still integer
		System.out.println(a%b);			//11  after division, get the remainder
		
		//see if a number is even number
		System.out.println(a%2 == 0);		//even
		System.out.println(0 == a%2);		//even
		System.out.println(b%2 == 0);		//odd
		
		System.out.println(a>b);
		System.out.println(a>=b);
		
		
		
	}

}
