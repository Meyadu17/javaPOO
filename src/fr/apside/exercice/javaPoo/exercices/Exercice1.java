package fr.apside.exercice.javaPoo.exercices;

import java.util.Scanner;

public class Exercice1 {
	public static void main(String[] args) {
		//Convertions : byte > short > int > long > float > double
		//Classe Math pour les méthodes issue du monde mathématique
		// entrée clavier : Scanner permet de saisir des données a travers la console

		System.out.println("ax² + bx + c = 0");
		Scanner scanner = new Scanner(System.in);
		// Saisie de la valeur a
		System.out.print("Entrer a : ");
		double a = scanner.nextDouble();

		// Saisie de la valeur b
		System.out.print("Entrer b : ");
		double b = scanner.nextDouble();

		// Saisie de la valeur c
		System.out.print("Entrer c : ");
		double c = scanner.nextDouble();

		// pow permet de calculer une valeur avec un exposant. ici b²
		double discriminant = Math.pow(b, 2) - 4 * a * c;

		System.out.println("discriminant = b² - 4 * a * c = " + discriminant);



	}
}