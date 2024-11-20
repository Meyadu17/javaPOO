package fr.apside.exercice.javaPoo.exercices;

import java.util.List;

public class Exercice3 {
	public static void main(String[] args) {

		// Exercice 3
		System.out.println();
		for (int i=0; i<5; i++) {
			int j = i+1;
			System.out.println("Boucle for classique : " + j);
		}
		System.out.println();
		List<String> liste = List.of("a ", "b ", "c ");
		liste.forEach(System.out::print);

		System.out.println();
		System.out.println();
		List<String> liste2 = List.of("vache ", "grenouille ", "mouton ", "chien");
		liste2.stream().forEach(System.out::print);

	}
}