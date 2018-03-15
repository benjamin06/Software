import java.util.Random;
public class End_Examination extends Event{
	private HealthService service;
	public End_Examination(Patient patient, HealthService service, int time, double released_probability) {
		super(patient,time);
		this.time = time;
		this.service = service;
		this.service.Waiting_Queue.remove(this.patient);
		this.service.Patient_Already_Tested.add(this.patient);
		this.patient = patient;
		this.patient.setState(StatePatient.Waiting);


	}	
}