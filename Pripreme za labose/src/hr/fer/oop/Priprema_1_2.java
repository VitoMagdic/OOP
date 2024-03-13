package hr.fer.oop;

import java.util.Scanner;

public class Priprema_1_2 {

	public static void main(String[] args) {
		
		//Upis stringa
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//Ispis vrijednosti
		System.out.printf("Broj samoglasnika : %d", brojSamoglasnika(str));
		
	}

	private static int brojSamoglasnika(String str) {
		
		int broj = 0;
		
		//Pretvaram string u lowercase jer a != A
		str = str.toLowerCase();
		
		//Sam idem kroz string i brojim samoglasnike
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') broj++;
		}
		
		return broj;
	}
	
}
