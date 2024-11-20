package fr.apside.exercice.javaPoo.entity;

public class Car extends Vehicule{

	private String modelName;

	public Car(){
		super(false);
		System.out.println("Car");
	}

	public Car(String modelName){
		super(false);
		this.modelName = modelName;
		System.out.println("Car");
	}

	@Override
	public void accelerate() {
		System.out.println("Le car accélère.");
	}

	@Override
	public void start() {
		super.start();
		System.out.println("Le car est démmaré.");
	}

	@Override
	public String toString() {
		System.out.println("Model : " + modelName);
		return modelName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}
