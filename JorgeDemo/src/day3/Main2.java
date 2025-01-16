package day3;

public class Main2 {

	public static void main(String[] args) {
		/*
		// 1,2,3,4....99,100
		int i = 1;
		// alt+/ or ctrl + space
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		*/
		
//		calculate the result of 1+2+3+...+99+100
		/*
		int result = 0;
		
//		result += 1;	//result = result + 1;
//		result += 2;
//		result += 3;
//		//......
//		result += 99;
//		result += 100;
		//100 times
		
		int i=1;
		while(i<=100) {
			result += i;
			i++;
		}
		
		System.out.println("the result is :"+result);//5050
		*/
		
		/*
//		int i = 1;	//print all the odd number within 100
		int i = 2;	//print all the even number within 100
		
		while (i <= 100) {
			System.out.println(i);
			i+=2;
		}
		*/
		
		//loop+condition
		int i = 1;	//print all the odd number within 100
		
		while (i <= 100) {
//			only when i is odd
			if(i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		}
		
	}

}
















