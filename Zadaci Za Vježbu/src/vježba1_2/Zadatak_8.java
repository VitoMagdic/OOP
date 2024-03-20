package vježba1_2;

import java.util.Scanner;

public class Zadatak_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		while(true) {
			
			String s = sc.nextLine().trim();
			
			if(s.toLowerCase().equals("quit")) break;
			
			str += s + ' ';
			
			
		}
		
		System.out.println(str.toUpperCase());

	}

}
