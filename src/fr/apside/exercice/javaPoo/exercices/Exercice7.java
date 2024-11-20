package fr.apside.exercice.javaPoo.exercices;

import fr.apside.exercice.javaPoo.entity.Car;
import fr.apside.exercice.javaPoo.entity.Vehicule;

public class Exercice7 {
	public static void main(String[] args) {
		Vehicule vehicule = new Vehicule(false);
		Car car	= new Car("Golf 4");
		print(vehicule);
		System.out.println("");
		print(car);
	}

	public static void print (Vehicule vehicule) {
		//Convertion de vehicule en car
		// possible dans ce sens là mais pas dans l'autre car "Car" extend "Vehicule"
		// pour éviter les erreur et faire la convertion seulement si on a un objet "Car" en parametre in ajoute un if
		if (vehicule instanceof Car) {
			Car car = (Car) vehicule;
			car.setModelName("Peugeot 107");
		}
		System.out.println(vehicule);
	}
}
