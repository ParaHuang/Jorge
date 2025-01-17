package day4;

public class Main2 {

	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
		// i+= 1    	i++
		// i-= 1		i--

		//100,99,.....,3,2,1
		for(int i=100 ; i>=1 ; i--) {
			System.out.println(i);
		}
		
		/*
		 for(a ; b ; c){
		 	d
		 }
		 a->b->d->c->b->d->c->b->d->c->b(false), end the loop
		 */
	}

}
