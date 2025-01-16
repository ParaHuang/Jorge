package day2;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1.if...
		 if(statement){
		 	operation
		 }
		 2.if...else...
		 if(statement){
		 	operationA
		 }else{
		 	operationsB
		 }
		 
		 3. if...else if...else if...else...
		 if(statement1){
		 	operationA
		 }else if(statement2){
		 	operationB
		 }else if(statement3){
		 	operationC
		 }else{
		 	operationD
		 }
		 
		 
		 
		 
		 */
		
		/*
		int num = 12;
		if(num%2 == 0) {
			System.out.println(num+" is an even number");
		}else {
			System.out.println(num+" is an odd number");
		}
		*/
		
		int grade = 87;   //0~100
		//1~100
		//<60   not pass
		//60~69 pass
		//70~79 good
		//80~100 excellent
		if(grade<60) {
			System.out.println("not pass\n" + grade);
		}else if(grade < 70) {
			System.out.println("pass\n" + grade);
		}else if(grade < 80) {
			System.out.println("good\n" + grade);
		}else {
			System.out.println("excellent\n" + grade);
		}
		
//		int x = 10;
//		
//		if(x<20) {
//			System.out.println("hello");
//			x*=10;//->100
//		}else {
//			System.out.println("hey");
//		}
//		
		
		
		
		
		
		
		
		
	}

}
