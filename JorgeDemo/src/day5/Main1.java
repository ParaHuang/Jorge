package day5;

public class Main1 {
	public static void main(String[] args) {
		for(int i=1 ; i<=9 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				//i->row    j->column
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		
		
		//do something for x times
//		for(int i=1 ; i<=x ; i++) {
//			
//		}
	}
}
