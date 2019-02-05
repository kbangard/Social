package metiers;

public class JobsEtudiants {
	private String employeFF;
	private String babySitter;
	public JobsEtudiants(String employeFF, String babySitter) {
		this.employeFF = employeFF;
		this.babySitter = babySitter;
	}
	public String getEmployeFF() {
		return employeFF;
	}
	public String getBabySitter() {
		return babySitter;
	}
	@Override
	public String toString() {
		return "JobsEtudiants [employeFF=" + employeFF + ", babySitter=" + babySitter + "]";
	}
	
	

}
