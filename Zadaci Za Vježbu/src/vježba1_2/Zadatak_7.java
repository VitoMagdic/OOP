package vježba1_2;

import java.util.Scanner;

public class Zadatak_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double osn = sc.nextDouble();
		double kap = osn;
		float sto = sc.nextFloat();
		int t = sc.nextInt();
		
		for(int i = 0; i <= t; i++) {
			System.out.printf("%.2f\n", kap);
			kap += osn * sto;
		}
		

	}

}
