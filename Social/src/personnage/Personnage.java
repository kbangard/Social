package personnage;

public abstract class Personnage {
	private String nom;
	private String prenom;
	private String surnom;
	
	public Personnage(String nom, String prenom, String surnom) {
		this.nom = nom;
		this.prenom = prenom;
		this.surnom = surnom;
	}
	
	public void deplacement() {}

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

	public String getSurnom() {
		return surnom;
	}

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", prenom=" + prenom + ", surnom=" + surnom + "]";
	}
	
	
}
