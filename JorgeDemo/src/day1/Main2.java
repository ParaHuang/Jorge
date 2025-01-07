package day1;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// !  not
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		//&&    and   :   both side are true, the result is true
		System.out.println(true && true);			//true
		System.out.println(true && false);			//false
		System.out.println(false && true);			//false
		System.out.println(false && false);			//false
		
		//if tomorrow is a sunny day, and I get paid, then I go shopping
		//statement 1: tomorrow is a sunny day, I didn't get paid -> no
		//statement 2: tomorrow is a raining day, I  get paid -> no
		//statement 3: tomorrow is a raining day, I didn't get paid -> no
		//statement 4: tomorrow is a sunny day, I get paid -> yes
		
		//  runs : x in the range from 2 to 4
		int x = 1;
		if(x>=2 && x<=4) {
			System.out.println("you will go shopping");
		}else {
			System.out.println("no shopping");
		}
		
		
		//||    or:   any side is true, the result is true
		System.out.println(true || true);			//true
		System.out.println(true || false);			//true
		System.out.println(false || true);			//true
		System.out.println(false || false);			//false
		
		//if tomorrow is a sunny day, or I get paid, then I go shopping
		//statement 1: tomorrow is a sunny day, I didn't get paid -> yes
		//statement 2: tomorrow is a raining day, I  get paid -> yes
		//statement 3: tomorrow is a raining day, I didn't get paid -> no
		//statement 4: tomorrow is a sunny day, I get paid -> yes
		
		
		System.out.println(2+3>6 || 12/3==4);
		
		
		
	}

}
