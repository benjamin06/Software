
public class Transportation extends Event{
	private Transporter transporter;
	private Room stop;
	
	public Transportation(Patient patient, int time, Transporter transporter,Room stop) {
		super(patient,time);
		this.time = time;
		this.patient = patient;
		this.stop = stop;
		this.duration = (int) transporter.probability.generateSample();
		if(this.stop == Room.Wating_Room) {
			this.patient.setState(StatePatient.Waiting);
			this.patient.addHistory(new CoupleStateTime(StatePatient.Waiting, this.time+this.duration));
		}
		if(this.stop == Room.MRI || this.stop == Room.XRay || this.stop == Room.Blood) {
			this.patient.setState(StatePatient.Taking_exam);
			this.patient.addHistory(new CoupleStateTime(StatePatient.Taking_exam, this.time+this.duration));
		}
		if(this.stop==Room.Consultation) {
			this.patient.setState(StatePatient.Being_visited);
			this.patient.addHistory(new CoupleStateTime(StatePatient.Being_visited, this.duration+this.time));
			
		}
		this.transporter = transporter;
			
		
		this.transporter.setState(StatePhysician.Busy);
		this.transporter.waiting_queue.remove(this.patient);
		
		
	}
}
