package evenements;

public class Reussite {
	private String diplome;
	private String travail;
	private String promotion;
	public Reussite(String diplome, String travail, String promotion) {
		this.diplome = diplome;
		this.travail = travail;
		this.promotion = promotion;
	}
	public String getDiplome() {
		return diplome;
	}
	public String getTravail() {
		return travail;
	}
	public String getPromotion() {
		return promotion;
	}
	@Override
	public String toString() {
		return "Reussite [diplome=" + diplome + ", travail=" + travail + ", promotion=" + promotion + "]";
	}
	
	

}
