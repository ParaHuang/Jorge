package day5;

import java.util.Random;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int rock = 1;
//		int paper = 2;
//		int scissors = 3;
		
		
		
		Scanner scanner = new Scanner(System.in);
		Random randomCpu = new Random();
		int option = 1;
		
		do {
			
			System.out.println("Choose 1-Rock,2-Paper,Or 3-Scissors");
			int user = scanner.nextInt();
			if (user == 1) {
				System.out.println("User chose rock");
			} else if (user == 2) {
				System.out.println("User chose paper");
			} else if (user == 3) {
				System.out.println("User chose scissors");
			}
			//when the user input invalid number, force him keep inputing until it's correct
			
			int cpu = randomCpu.nextInt(1, 4);

			if (cpu == 1) {
				System.out.println("Computer chose rock");
			} else if (cpu == 2) {
				System.out.println("Computer chose paper");
			} else {
				System.out.println("Computer chose scissors");
			}
			
			if (cpu == user) {
				System.out.println("Its a Tie.");
			} else if (user == 1 && cpu == 3 || user == 2 && cpu == 1 || user == 3 && cpu == 2) {
				System.out.println("User wins!!");
			} else {
				System.out.println("CPU Wins!!");
			}
			System.out.println("do you want to play for 1 more round? 1-yes , other-no:");
			option = scanner.nextInt();
			
		}while(option==1);  
		
		System.out.println("Game Over!");

	}
}









