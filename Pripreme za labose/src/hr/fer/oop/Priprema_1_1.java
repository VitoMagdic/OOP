package hr.fer.oop;

import java.math.*;

public class Priprema_1_1 {

	public static void main(String[] args) {
		
	// Tu stavis bilo koje polje, ja sam koristio njihovo al mozes i generirati vlastito
	int polje[] = {10, 20, 30, 40, 50, 60};
	
	swap(polje);
	
	}

	private static void swap(int[] arr) {
		
		//Provjera kak polje izgleda
		/*for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
			if(i == arr.length - 1) System.out.printf("\n");
		}*/
		
		//Generacija nasumicnih brojeva
		int a = 0, b = 0, c = 0;
		do{
			a = (int) (Math.random() * (arr.length));
			b = (int) (Math.random() * (arr.length));
			c = (int) (Math.random() * (arr.length));
		}while((a == b || a == c || b == c) || (a > b || a > c || b > c));
		
		//Pregled generiranih brojeva
		//System.out.printf("Prvi %d Drugi %d Treci %d \n", a, b, c);
		
		//Zamjena
		int temp;
		temp = arr[b];
		arr[b] = arr[c];
		arr[c] = arr[a];
		arr[a] = temp;
		
		//Finalna provjera
		/*for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}*/
		
	}
	
}


