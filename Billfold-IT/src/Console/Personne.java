package Console;

import javax.swing.JOptionPane;

//classe qui défini les différentes caractéristiques d'une Personne
public class Personne {
	private String nom;
	private String prenom;
	private String role;
	private String  salaried;
	
	public Personne() {
		
		this.nom = JOptionPane.showInputDialog("Entrez votre nom");;
		this.prenom = JOptionPane.showInputDialog("Entrez votre prénom");;
		this.role = JOptionPane.showInputDialog("Entrez votre rôle dans la famille");
		this.salaried = JOptionPane.showInputDialog("Etes-vous salirié ? (y/n)");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSalaried() {
		return salaried;
	}

	public void setSalaried(String salaried) {
		this.salaried = salaried;
	}

	@Override
	public String toString() {
		return "Votre nom : " + nom + "\nPrénom : " + prenom + "\nRôle dans la famille : " + role + "\n Salarié : " + salaried;
	}
}
