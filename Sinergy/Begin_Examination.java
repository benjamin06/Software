
public class Begin_Examination extends Event{
	private HealthService service;
	public Begin_Examination(Patient patient, int time, HealthService service) {
		super(patient,time);
		this.service = service;
		this.duration= (int) this.service.waiting_probability.generateSample();
		this.patient.setState(StatePatient.Taking_exam);
		this.patient.addHistory(new CoupleStateTime(StatePatient.Taking_exam, time));
		this.service.Waiting_Queue.remove(this.patient);
		this.patient.cost += this.service.cost*this.patient.insurance;
		
		
	}
}
