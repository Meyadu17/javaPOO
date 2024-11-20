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

	public void stop() {
		started = false;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

}
