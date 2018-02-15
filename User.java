package com.darrellstovall.onboardingapplicationjava;

public class User {

	private String firstName;
	private String lastName;
	private int age = 0;
	private boolean isMinor = false;
	
	public String getFullName() {
		
		String name = "";
		if (firstName != null && !firstName.isEmpty()) {
			name += firstName;
		}
		
		if (lastName != null && !lastName.isEmpty()) {
			name += (name.isEmpty() ? "" : " ") + lastName;
		}
		
		return name.isEmpty() ? null: name;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMinor() {
		return isMinor;
	}

	public void setMinor(boolean isMinor) {
		this.isMinor = isMinor;
	}

}

