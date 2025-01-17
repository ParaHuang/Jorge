package day4;

public class Main3 {

	public static void main(String[] args) {
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		
		
		for(int i = 1 ; i <= 5 ; i++) {	//print as many rows as you want, just change the number after i<=
//			System.out.println("*****");
			// ==
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
//			System.out.print("*");
			//nesting loop
			for(int  j = 1 ; j <= 5 ; j++) {//print as many columns as you want,just change the number after j<=
				System.out.print("*");
			}
			
			System.out.println();//change a new line
		}
		
		System.out.println();
		
		for(int i = 1 ; i <= 9 ; i++) {	

			for(int  j = 1 ; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();//change a new line
		}
		
	}

}
//i, j, k , l , m , n
