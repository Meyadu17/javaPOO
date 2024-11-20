package fr.apside.exercice.javaPoo.exercices;

import fr.apside.exercice.javaPoo.entity.BankAccount;

public class Exercice6 {
	public static void main(String[] args) {

		// Exercice 6
		// Créer une classes "BankAccount"
		// Attributs : owner, balance
		// Méthodes : Getter & Setter & Contructeur paramétré
		// => Créer 1 instances de la classe "BankAccount"
		// => Faire un retrait puis un versement
		// => Afficher le solbe final

		BankAccount bankAccount1 = new BankAccount(50, "John Doe", false);
		//ces méthodes sont abstraites car elle n'ont  pas connaissance de ce qui ce passent dans init() et dans deposit().
		bankAccount1.withdraw(20);
		bankAccount1.deposit(100);

		System.out.println("Bonjour "+ bankAccount1.getOwner()+" votre solde est de : " + bankAccount1.getBalance() + " euros");

	}
}