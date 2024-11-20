package fr.apside.exercice.javaPoo.entity;

public class Contact {
	// Exercice 9
	private String name;
	private String email;
	private PhoneNumber phone;

	public Contact(String name, PhoneNumber phoneNumber) {
		this.name = name;
		this.phone = phoneNumber;
	}

	public Contact(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PhoneNumber getPhone() {
		return phone;
	}

	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "- " + name + " : " + (email != null ? email : phone);
	}
}
