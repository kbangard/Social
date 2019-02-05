package evenements;

public class Echec {
	private String licenciement;
	private String echecDiplome;
	public Echec(String licenciement, String echecDiplome) {
		this.licenciement = licenciement;
		this.echecDiplome = echecDiplome;
	}
	public String getLicenciement() {
		return licenciement;
	}
	public String getEchecDiplome() {
		return echecDiplome;
	}
	@Override
	public String toString() {
		return "Echec [licenciement=" + licenciement + ", echecDiplome=" + echecDiplome + "]";
	}
	
	

}
