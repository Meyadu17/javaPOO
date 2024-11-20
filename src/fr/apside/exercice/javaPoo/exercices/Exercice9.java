package fr.apside.exercice.javaPoo.exercices;

import fr.apside.exercice.javaPoo.entity.Contact;
import fr.apside.exercice.javaPoo.entity.PhoneNumber;

public class Exercice9 {
	public static void main(String[] args) {
		Contact contact1 = new Contact("Jeanne Doe", new PhoneNumber(33, "05 46 47 90 12"));
		Contact contact2 = new Contact("Père Noël", new PhoneNumber(22, "05 46 47 25 12"));
		Contact contact3 = new Contact("Dark Vador", "darky666@galactic-empire.com");

		System.out.println(contact1);
		System.out.println(contact2);
		System.out.println(contact3);

	}
}
