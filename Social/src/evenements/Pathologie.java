package evenements;

public class Pathologie {
	private String maladie;

	public Pathologie(String maladie) {
		this.maladie = maladie;
	}

	public String getMaladie() {
		return maladie;
	}

	@Override
	public String toString() {
		return "Pathologie [maladie=" + maladie + "]";
	}
	
	

}
