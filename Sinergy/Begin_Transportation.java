
public class Begin_Transportation extends Event{
	public Begin_Transportation(Patient patient, ProbabilityDistribution probability, int time) {
		super(patient,probability,time);
		this.time = (int) probability.generateSample();
		patient.setState(StatePatient.Waiting);
		patient.addHistory(new CoupleStateTime(StatePatient.Waiting, time));
	}
}
