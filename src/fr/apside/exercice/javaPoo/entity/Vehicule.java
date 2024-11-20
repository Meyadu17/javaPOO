package fr.apside.exercice.javaPoo.entity;

public class Vehicule {

	private boolean started;

	public Vehicule(boolean started){
		this.started = started;
		System.out.print("Vehicule : ");
	}

	public void accelerate() {

	}

	public void start() {
		started = true;
	}

	// ajouter final sur la méthode signifie que les classes qui héritent de Vehicule ne peuvent pas redéfinir cette méthode.
	public final void stop() {
		started = false;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

}
