package facto;

import java.util.Scanner;
import java.lang.*;

public class Factorielle {

	public static void main(String[] arg) {		
		int n;
		int factorielle =1;
		String nbre = "inconnu";
		
		System.out.println("Entrez un nombre, s'il vous plaît :");
		Scanner clavier = new Scanner(System.in);
		nbre = clavier.nextLine();
		
		n = Integer.parseInt(nbre);
		for(int i=2; i<n; i++ ){  
		factorielle *= i;
		System.out.println("La factorielle de "+n+" est "+factorielle);
		 }
		}

}
