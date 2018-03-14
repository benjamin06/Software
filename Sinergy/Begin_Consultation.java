
public class Begin_Consultation extends Event{
	public Begin_Consultation(Patient patient, ProbabilityDistribution probability, int time) {
		super(patient,probability,time);
		this.time = (int) probability.generateSample();
		patient.setState(StatePatient.Being_visited);
		patient.addHistory(new CoupleStateTime(StatePatient.Being_visited, time));
		
	}
}
