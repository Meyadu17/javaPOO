package fr.apside.exercice.javaPoo.exercices;

import java.util.Scanner;

public class Exercice4 {
	public static void main(String[] args) {

		// Entre while est do while,il y a une légère différence avec do while ily a a minima une execution du code

		// Exercice 4
		// saisir une hauteur
		// saisir une largeur
		// afficher dans la console un tableau de "#" avec une hauteur de la valeur saisie dans hauteur et une largeur de la largeur saisie dans largeur.
		System.out.println("Exercice 4");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrer la hauteur : ");

		int hauteur = scanner.nextInt();
		System.out.print("Entrer la largeur : ");

		int largeur = scanner.nextInt();
		for (int i = 0; i < hauteur; i++) {

			for (int j = 0; j < largeur; j++) {
				System.out.print("()");
			}
			System.out.println();

		}



	}
}