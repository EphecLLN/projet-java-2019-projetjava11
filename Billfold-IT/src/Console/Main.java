package Console;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.print("Bienvenue sur Billford-IT ! \n");
		
		
		
		Personne personne1 = new Personne();
		System.out.println(personne1);
		
		Salaire salaire1 = new Salaire();
		System.out.println(salaire1);
		
		
	}
}
