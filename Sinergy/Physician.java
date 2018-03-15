import java.util.ArrayList;

public class Physician extends Human_Ressources{
	public ArrayList<Patient> Patient_already_tested;
	public ArrayList<Message> message_box;
	


	public Physician(int id, StatePhysician state, ProbabilityDistribution probability) {
		super(id,state,probability);
		this.Patient_already_tested = new ArrayList<Patient>();
		this.message_box = new ArrayList<Message>();
		
		
	}
	
	public void addMessage(Message message) {
		message_box.add(message);
	}

	public ArrayList<Patient> getPatient_already_tested() {
		return Patient_already_tested;
	}

	public void setPatient_already_tested(ArrayList<Patient> patient_already_tested) {
		Patient_already_tested = patient_already_tested;
	}
	
	public ProbabilityDistribution getProbability() {
		return probability;
	}

	public void setProbability(ProbabilityDistribution probability) {
		this.probability = probability;
}
}
	
