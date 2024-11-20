package fr.apside.exercice.javaPoo.entity;

// Le terme final dans la déclaration d'une classe signifie que cette classe ne peut avoir d'enfant.
// Elle devient immutable. C'est aussi le cas de la classe String
// Dans notre exemple, il ne peut y avoir de classe qui extends Bus.
public final class Bus extends Vehicule{

	public Bus(){
		super(false);
		System.out.println("Bus");
	}

	@Override
	public void start() {
		super.start();
		System.out.println("Le bus est démmaré.");
	}

	@Override
	public void accelerate() {
		System.out.println("Le bus accélère.");

	}

}
