
public class End_Consultation extends Event{
	private Physician physician;
	
	public End_Consultation(Patient patient,int time, Physician physician) {
		super(patient, time);
		this.physician.patient_already_tested.add(patient);
		this.physician.setState(StatePhysician.Idle);
		this.physician.waiting_queue.remove(patient);
		this.patient.setState(StatePatient.Waiting);
		
	}
}

