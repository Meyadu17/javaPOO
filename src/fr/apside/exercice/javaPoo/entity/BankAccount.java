package fr.apside.exercice.javaPoo.entity;

public class BankAccount {
	// Exercice 6
	// Créer une classes "BankAccount"
	// Attributs : owner, balance
	// Méthodes : Getter & Setter & Contructeur paramétré
	// => Créer 1 instances de la classe "BankAccount"
	// => Faireun retrait puis un versement
	// => Afficher le solbe final
	private double balance;
	private String owner;
	private boolean isClosed;

	 static int numberOfAccount = 0;

	public BankAccount(double balance, String owner, boolean isClosed) {
		this.isClosed = false;

		if (balance < 0)
			balance = 0;

		this.balance = balance;
		this.owner = owner;
		this.isClosed = isClosed;

		numberOfAccount++;

	}

	// Un attribut déclaré static appartient à la classe elle-même, et non à une instance particulière de cette classe.
	// Cela signifie qu'il existe une seule copie de cet attribut pour toute la classe, indépendamment du nombre d'objets créés.
	public static void printNumberOfAccount() {
		System.out.println("Nombre de compte : " + numberOfAccount);
	}
	public void deposit(double amount) {
		if (amount > 0 && !isClosed)
			this.balance += amount;
	}

	public void withdraw() {
		if (balance > 0 && !isClosed)
			this.balance -= 5;
	}

	public void withdraw(double amount) {
		if (balance > 0 && !isClosed)
			this.balance -= amount;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed(boolean closed) {
		isClosed = closed;
	}
}
