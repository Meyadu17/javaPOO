package fr.apside.exercice.javaPoo.entity;

public class Employee {
	// Exercice 5
	// Créer une classes "Employee"
	// Attributs : name, age, salary, location
	// Méthode : raiseSalary
	// => Créer 2 instances de la classe "Employee"
	// => Accorder une augmentation à un employé
	// => Afficher le salaire des deux employés

	private String name;
	private int salary;
	private int age;
	private String location;

	public void raiseSalary(int percentage) {
		salary = salary + (salary * percentage) / 100;
	}

	public Employee(String name, int salary, int age, String location) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
