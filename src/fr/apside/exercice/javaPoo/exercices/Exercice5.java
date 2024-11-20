package fr.apside.exercice.javaPoo.exercices;

import fr.apside.exercice.javaPoo.entity.Employee;

public class Exercice5 {
	public static void main(String[] args) {
		// Exercice 5
		// Créer une classes "Employee"
		// Attributs : name, age, salary, location
		// Méthode : raiseSalary
		// => Créer 2 instances de la classe "Employee"
		// => Accorder une augmentation à un employé
		// => Afficher le salaire des deux employés

		Employee employee1 = new Employee("John Doe", 1300, 25, "Paris");
		Employee employee2 = new Employee("Janne Doe", 2000, 55, "Paris");
		employee1.raiseSalary(10);
		System.out.println(employee1.getName() + " : " + employee1.getSalary());
		System.out.println(employee2.getName() + " : " + employee2.getSalary());

	}
}