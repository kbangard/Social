package personnage;

public class Relation {
	private String professionnelle;
	private String amicale;
	private String familliale;
	private String amoureuse;
	public Relation(String professionnelle, String amicale, String familliale, String amoureuse) {
		this.professionnelle = professionnelle;
		this.amicale = amicale;
		this.familliale = familliale;
		this.amoureuse = amoureuse;
	}
	public String getProfessionnelle() {
		return professionnelle;
	}
	public void setProfessionnelle(String professionnelle) {
		this.professionnelle = professionnelle;
	}
	public String getAmicale() {
		return amicale;
	}
	public void setAmicale(String amicale) {
		this.amicale = amicale;
	}
	public String getFamilliale() {
		return familliale;
	}
	public void setFamilliale(String familliale) {
		this.familliale = familliale;
	}
	public String getAmoureuse() {
		return amoureuse;
	}
	public void setAmoureuse(String amoureuse) {
		this.amoureuse = amoureuse;
	}
	@Override
	public String toString() {
		return "Relation [professionnelle=" + professionnelle + ", amicale=" + amicale + ", familliale=" + familliale
				+ ", amoureuse=" + amoureuse + "]";
	}
	
	
}
