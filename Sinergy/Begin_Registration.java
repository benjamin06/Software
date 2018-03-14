
public class Begin_Registration extends Event{
	public Begin_Registration(Patient patient, ProbabilityDistribution probability, int time) {
		super(patient,probability,time);
		this.time = (int) probability.generateSample();
		patient.setState(StatePatient.Waiting);
		patient.addHistory(new CoupleStateTime(StatePatient.Waiting, time));
	}
}
