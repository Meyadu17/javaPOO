package fr.apside.exercice.javaPoo.entity;

public class PhoneNumber {

	private int contryCode;
	private String phone;

	public PhoneNumber(int contryCode, String phone) {
		this.contryCode = contryCode;
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getContryCode() {
		return contryCode;
	}

	public void setContryCode(int contryCode) {
		this.contryCode = contryCode;
	}

	@Override
	public String toString() {
		return "(+" + contryCode + ") " + phone;
	}
}
