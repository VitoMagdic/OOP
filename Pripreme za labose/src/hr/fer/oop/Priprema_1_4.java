package hr.fer.oop;

//BITNO, Edgar kaže da trebaš preimenovat klasu i da nije javna
class Priprema_1_4 {

	public static void main(String[] args) {
		
		//Ovdje sam koristio njihov primjer, može se promjeniti
		String[] a = {"aa EN","Berlin","Roubaix"};
		
		//Ispis
		System.out.printf(stringFloss(a));
	}
	
	public static String stringFloss(String[] elements){
		
		/*Postavljanje stringa kojeg cemo printat, i stvaranje liste koja 
		broji koliko znamenka svaki string ima*/
		String str = "";
		int z[] = new int[elements.length];
		for(int i = 0; i < elements.length; i++) {
			z[i] = elements[i].length();
		}
		
		//Prolaz kroz listu ispisivanja pojedinačnih znamenki
		for(int i = 0; i < elements.length; i++) {
			
			if(z[i] == 0) continue;
			str += elements[i].charAt(elements[i].length() - z[i]);
			z[i] -= 1;
			
			//Da se vratimo na pocetak polja
			if(i == elements.length - 1) {
				int a = 0;
				for(int j = 0; j < z.length; j++) {
					if(z[j] != 0) a++;
				}
				if(a != 0) i = - 1;
			}
			
		}
		
		return str;
	}
	
}
