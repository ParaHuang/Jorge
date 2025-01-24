package day5;

import java.util.Random;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Random random = new Random();
		int answer = random.nextInt(1,101);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("hello, the computer just generated a number(1-100):");
//		while(true) {
//			System.out.println("guess what it is?");
//			int guess = scanner.nextInt();
//			
////			too small/too big/correct(stop the game)
//			if(answer<guess) {
//				System.out.println("too big");
//			}else if(answer>guess) {
//				System.out.println("too small");
//			}else {
//				System.out.println("correct");
//				break;	//interrupt the loop 
//			}
//		}
		
		int guess = -1;
		do{
			System.out.println("guess what it is?");
			guess = scanner.nextInt();
			
//			too small/too big/correct(stop the game)
			if(answer<guess) {
				System.out.println("too big");
			}else if(answer>guess) {
				System.out.println("too small");
			}else {
				System.out.println("correct");
			}
		}while(guess!=answer);
		
	}

}
