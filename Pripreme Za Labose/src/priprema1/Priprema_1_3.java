package priprema1;

import java.util.Scanner;

public class Priprema_1_3 {

	public static void main(String[] args) {
		
		//Upis brojeva
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		
		//Provjera ako funkcija radi
		if(common_digit(a, b)) System.out.println("Imaju barem jednu zajednicu znamenku.");
		else System.out.println("Nemaju niti jednu zajednicu znamenku.");
	}
	
	private static boolean common_digit(int twoDigitNum1, int twoDigitNum2) {
		
		//Provjera ako nisu dvoznamekasti, jer ak nisu ne nastavljamo
		if(!(twoDigitNum1 >= 10 && twoDigitNum1 <= 99)) return false;
		if(!(twoDigitNum2 >= 10 && twoDigitNum2 <= 99)) return false;
		
		//Dvije provjere, prvi red uspoređujem desnu znamenku prvog broja sa obije znamenke drugog, drugi red isto ali sa lijevom znamenkom
		if(twoDigitNum1 % 10 == twoDigitNum2 % 10 || twoDigitNum1 % 10 == twoDigitNum2 / 10) return true;
		if(twoDigitNum1 / 10 == twoDigitNum2 % 10 || twoDigitNum1 / 10 == twoDigitNum2 / 10) return true;
		
		return false;
	}

}
