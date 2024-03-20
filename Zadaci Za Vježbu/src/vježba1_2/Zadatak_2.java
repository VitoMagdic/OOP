package vježba1_2;

public class Zadatak_2 {

	public static void main(String[] args) {
		   
		double pi = 0;
		double ind = 0;
		int z = 0;
		
		for(int i = 1; true; i++) {
			z++;
			ind += 1 / Math.pow(i, 2);
			pi = Math.sqrt(ind * 6);
			if(3.14159 <= pi && pi <= 3.141599) {
				break;
			}
		}
		System.out.println(z);

	}

}
