package personnage;

public class Sexe {
	private String masculin;
	private String feminin;
	public Sexe(String masculin, String feminin) {
		this.masculin = masculin;
		this.feminin = feminin;
	}
	public String getMasculin() {
		return masculin;
	}
	public void setMasculin(String masculin) {
		this.masculin = masculin;
	}
	public String getFeminin() {
		return feminin;
	}
	public void setFeminin(String feminin) {
		this.feminin = feminin;
	}
	@Override
	public String toString() {
		return "Sexe [masculin=" + masculin + ", feminin=" + feminin + "]";
	}
	
	
}
