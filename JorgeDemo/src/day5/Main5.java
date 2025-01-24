package day5;


public class Main5 {

	public static void main(String[] args) {
		//break
		
		for(int i=1 ; i<=5 ; i++) {
			if(i==3) {
//				continue;	//skip the current time
//				break;		//end the whole loop
				return;		//stop the program
			}
			System.out.println(i);
		}
		
		System.out.println("----end----");
		
	}

}
