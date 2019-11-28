package be.billfoldit.console;

import javax.swing.JOptionPane;

//classe qui défini les différentes caractéristiques d'un un salaire
public class Salaire {
	private int salary;
	private int charges;
	private int rent;
	private int vehicule;
	private int transport;
	private int food;
	private int hobbies;
	private int health;
	private int other;

	public Salaire() {
		
		this.salary = Integer.parseInt(JOptionPane.showInputDialog("Quel est votre salaire ?"));
		this.charges = Integer.parseInt(JOptionPane.showInputDialog("Quel est le total des charges ?"));
		this.rent = Integer.parseInt(JOptionPane.showInputDialog("Quel est votre loyer ?"));
		this.vehicule = Integer.parseInt(JOptionPane.showInputDialog("Quel est le total à payer pour vos transports ?"));
		this.transport = Integer.parseInt(JOptionPane.showInputDialog("Quel est le total à payer pour la nourriture ?"));
		this.food = Integer.parseInt(JOptionPane.showInputDialog("Quel est le total à payer pour vos hobbies ?"));
		this.hobbies = Integer.parseInt(JOptionPane.showInputDialog("Quel est le total à payer pour votre voiture ?"));
		this.health = Integer.parseInt(JOptionPane.showInputDialog("Quel est le total à payer pour votre santé ?"));
		this.other = Integer.parseInt(JOptionPane.showInputDialog("Autres dépenses ?"));
		
		int budget;

		budget = this.salary - this.charges - this.rent - this.vehicule - this.transport - this.food - this.hobbies - this.health - this.other;
		
		System.out.println("\n-----------------------------");
		System.out.println("Votre budget est de " + budget);
		System.out.println("------------------------------");
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public int getVehicule() {
		return vehicule;
	}

	public void setVehicule(int vehicule) {
		this.vehicule = vehicule;
	}

	public int getTransport() {
		return transport;
	}

	public void setTransport(int transport) {
		this.transport = transport;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public int getHobbies() {
		return hobbies;
	}

	public void setHobbies(int hobbies) {
		this.hobbies = hobbies;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getOther() {
		return other;
	}

	public void setOther(int other) {
		this.other = other;
	}

	@Override
	public String toString() {
		return "\nVotre salaire : +" + salary + "\nVos charges : -" + charges + "\nVotre loyer : -" + rent + "\nVos frais vehicule : -" + vehicule
				+ "\nVos frais transport : -" + transport + "\nVos frais nourriture : -" + food + "\nVos frais pour les hobbies : -" + hobbies + "\nVos frais santé : -" + health
				+ "\nAutres : -" + other; 
	}
}
