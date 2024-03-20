package vježba1_2;

public class Zadatak_5 {

	public static void main(String[] args) {
		
		if(args.length == 3 && Double.parseDouble(args[0]) != 0) {
			
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double c = Double.parseDouble(args[2]);
			
			double D = b * b - 4 * a *c;
			
			if(D < 0) {
				System.out.println("No solution avaliable in R");
			}
			else if(D == 0) {
				System.out.printf("Rjesenje je %f", (-1 * b) / (2 * a));
			}
			else {
				double r1, r2;
				r1 = ((-1 * b) - Math.sqrt(D)) / (2 * a);
				r2 = ((-1 * b) + Math.sqrt(D)) / (2 * a);
				
				System.out.printf("Rjesenja su %f i %f", r1, r2);

			}
			
		}
		else {
			System.out.println("Program need arguments for a, b, and c in ax^2 + bx = c");
		}
		
	}

}
