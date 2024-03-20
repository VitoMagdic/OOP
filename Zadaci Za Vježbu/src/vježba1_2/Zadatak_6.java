package vježba1_2;

import java.util.Scanner;

public class Zadatak_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Molimo upisite a");
		double a = sc.nextDouble();
		System.out.println("Molimo upisite b");
		double b = sc.nextDouble();
		System.out.println("Molimo upisite c");
		double c = sc.nextDouble();
		
		double D = b * b - 4 * a *c;
		
		if(D < 0) {
			System.out.println("No solution avaliable in R");
		}
		else if(D == 0) {
			System.out.printf("Rješenje je %f", (-1 * b) / (2 * a));
		}
		else {
			double r1, r2;
			r1 = ((-1 * b) - Math.sqrt(D)) / (2 * a);
			r2 = ((-1 * b) + Math.sqrt(D)) / (2 * a);
			
			System.out.printf("Rjesenja su %f i %f", r1, r2);

		}
	}

}
