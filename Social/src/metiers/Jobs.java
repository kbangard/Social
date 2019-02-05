package metiers;

public class Jobs {
	private String informaticien;
	private String professeur;
	
	public Jobs(String informaticien, String professeur) {
		this.informaticien = informaticien;
		this.professeur = professeur;
	}
	public String getInformaticien() {
		return informaticien;
	}
	public String getProfesseur() {
		return professeur;
	}
	@Override
	public String toString() {
		return "Jobs [informaticien=" + informaticien + ", professeur=" + professeur + "]";
	}
	
	

}
