package fr.apside.exercice.javaPoo;

import fr.apside.exercice.javaPoo.entity.Bus;
import fr.apside.exercice.javaPoo.entity.Car;
import fr.apside.exercice.javaPoo.entity.Vehicule;

public class Main {
	public static void main(String[] args) {


		Vehicule[] vehicules = {new Car(), new Bus(), new Car() };

		for (Vehicule vehicule : vehicules) {
			//Polymophisme
			vehicule.start();
			vehicule.accelerate();

		}

	}

}