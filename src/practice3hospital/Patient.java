package practice3hospital;

public class Patient extends Data{
	
	private String name;
	private String lastname;
	private int patientId;
	private Case patientCase;
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public Case getPatientCase() {
		return patientCase;
	}

	public void setPatientCase(Case patientCase) {
		this.patientCase = patientCase;
	}

	
	@Override
	public String toString() {
		return "Patient [name=" + name + ", lastname=" + lastname + ", patientId=" + patientId + ", patientCase="
				+ patientCase + "]";
	}
	
	
	

}
