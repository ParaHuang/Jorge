package day2;

import java.util.Random;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//show options:   alt + /
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		System.out.println("you just entered:"+num);
		
		//random number
		//reference type
		//Type name = new Type();
		Random randomCpu = new Random();
		int num1 = randomCpu.nextInt();	//generate a big random number
		System.out.println(num1);
		
		int num2 = randomCpu.nextInt(5);//generate a number in the range of 0~4
		System.out.println(num2);
		
		int num3 = randomCpu.nextInt(1,4);//generate a number in the range of 1~3
		System.out.println(num3);
		
	}

}
