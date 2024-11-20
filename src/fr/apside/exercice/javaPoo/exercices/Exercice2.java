package fr.apside.exercice.javaPoo.exercices;

import java.util.Scanner;

public class Exercice2 {
	public static void main(String[] args) {

		// Exercice 2
		// Si valeur divisible par 3 = "Fizz"
		// Si valeur divisible par 5 = "Buzz"
		// Si valeur divisible pas 3 et 5 = "Fizz Buzz"
		// Sinon valeur
		System.out.println("Exercice 2");
		System.out.print("Entrez une valeur :");
		Scanner scanner = new Scanner(System.in);
		double valeur = scanner.nextDouble();

		// Attention à l'ordre des if !
		if (valeur % 3 == 0 && valeur % 5 == 0)
			System.out.println("FizzBuzz");
		else if (valeur % 3 == 0)
			System.out.println("Fizz");
		else if (valeur % 5 == 0)
			System.out.println("Buzz");
		else
			System.out.println(valeur);

	}
}