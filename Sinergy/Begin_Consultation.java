
public class Begin_Consultation extends Event{
	private Physician physician;
	private Message message;
	
	public Begin_Consultation(Patient patient, int time, Physician physician,Message message) {
		super(patient,time);
		this.message = message;
		this.time = time;
		this.physician = physician;
		this.duration = (int) this.physician.probability.generateSample();
		this.patient.setState(StatePatient.Being_visited);
		this.patient.addHistory(new CoupleStateTime(StatePatient.Being_visited, time));
		this.message.setState_message(true);
		this.physician.waiting_queue.add(patient);
		this.physician.setState(StatePhysician.Busy);
		
		
	}
}
