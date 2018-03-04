import java.util.ArrayList;

public class Physician extends Human_Ressources{
	public ArrayList<Patient> Patient_already_tested;
	public ArrayList<Message> message_box;
	
	public Physician(StatePhysician state, int id) {
		super(id,state);
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
}
	
