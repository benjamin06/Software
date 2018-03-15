
public class Begin_Registration extends Event{
	private Nurse nurse;
	public Begin_Registration(Patient patient, ProbabilityDistribution probability, int time,Nurse nurse) {
		super(patient,time);
		this.time = (int) probability.generateSample();
		patient.setState(StatePatient.Waiting);
		patient.addHistory(new CoupleStateTime(StatePatient.Waiting, time));
		this.nurse = nurse;
		this.nurse.setState(StatePhysician.Busy);

	}
}
