
public class Begin_Examination extends Event{
	public Begin_Examination(Patient patient, ProbabilityDistribution probability, int time) {
		super(patient,probability,time);
		this.duration= (int) probability.generateSample();
		patient.setState(StatePatient.Taking_exam);
		patient.addHistory(new CoupleStateTime(StatePatient.Taking_exam, time));
	}
}
