package vježba1_2;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		double pi = 0;
		for (int i = 0; i < 10; i++) {
			pi += (Math.pow(-1, i)) / (2 * i + 1);
		}
		System.out.printf("%.10f\n", pi * 4);

		pi = 0;
		for (int i = 0; i < 100; i++) {
			pi += (Math.pow(-1, i)) / (2 * i + 1);
		}
		System.out.printf("%.10f\n", pi * 4);
		
		pi = 0;
		for (int i = 0; i < 1000; i++) {
			pi += (Math.pow(-1, i)) / (2 * i + 1);
		}
		System.out.printf("%.10f\n", pi * 4);
		
		pi = 0;
		for (int i = 0; i < 1000000; i++) {
			pi += (Math.pow(-1, i)) / (2 * i + 1);
		}
		System.out.printf("%.10f\n", pi * 4);
	}

}
