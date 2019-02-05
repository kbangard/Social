package evenements;

public class Mort {
	private String deuil;

	public Mort(String deuil) {
		this.deuil = deuil;
	}

	public String getDeuil() {
		return deuil;
	}

	@Override
	public String toString() {
		return "Mort [deuil=" + deuil + "]";
	}
	
	

}
