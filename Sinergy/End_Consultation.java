
public class End_Consultation extends Event{
	private Physician physician;
	
	public End_Consultation(Patient patient, Physician physician) {
		super();
		this.physician.Patient_already_tested.add(patient);
		this.physician.setState(StatePhysician.Idle);
		this.physician.waiting_queue.remove(patient);
		this.duration = 0;
	}
}

