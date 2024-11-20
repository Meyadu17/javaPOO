package fr.apside.exercice.javaPoo.entity;

public class Bus extends Vehicule{

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
