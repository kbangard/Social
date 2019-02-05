package personnage;

public class TrancheAge {
	private String periodeScolaire;
	private String adolescence;
	private String adulte;
	public TrancheAge(String periodeScolaire, String adolescence, String adulte) {
		this.periodeScolaire = periodeScolaire;
		this.adolescence = adolescence;
		this.adulte = adulte;
	}
	public String getPeriodeScolaire() {
		return periodeScolaire;
	}
	public void setPeriodeScolaire(String periodeScolaire) {
		this.periodeScolaire = periodeScolaire;
	}
	public String getAdolescence() {
		return adolescence;
	}
	public void setAdolescence(String adolescence) {
		this.adolescence = adolescence;
	}
	public String getAdulte() {
		return adulte;
	}
	public void setAdulte(String adulte) {
		this.adulte = adulte;
	}
	@Override
	public String toString() {
		return "TrancheAge [periodeScolaire=" + periodeScolaire + ", adolescence=" + adolescence + ", adulte=" + adulte
				+ "]";
	}
	
	

}
