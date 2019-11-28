package be.billfoldit.common;

public class Person {
	private int id;
	private String lastname, firstname;
	private TypeMember role;
	private boolean salaried;
	
	public Person(int id, String lastname, String firstname, TypeMember role, boolean salaried) {
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.role = role;
		this.salaried = salaried;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public TypeMember getRole() {
		return role;
	}

	public void setRole(TypeMember role) {
		this.role = role;
	}

	public boolean isSalaried() {
		return salaried;
	}

	public void setSalaried(boolean salaried) {
		this.salaried = salaried;
	}
	
}
