
public class End_Registration extends Event{
	private Nurse nurse;
	private Physician physician;
	public End_Registration(Patient patient,int time, Nurse nurse, Physician physician) {
		super(patient, time);
		this.nurse.patient_registered.add(patient);
		this.nurse.setState(StatePhysician.Idle);
		this.physician = physician;
		this.physician.addMessage(new Message(this.patient.id, this.time, false));
		this.patient = patient;
		this.patient.setState(StatePatient.Waiting);
		
}
}
