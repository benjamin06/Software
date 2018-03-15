import java.util.ArrayList;
public class Nurse extends Human_Ressources{
	protected ArrayList<Patient> patient_registered;
	public Nurse(int id, StatePhysician state,ProbabilityDistribution probability) {
		super(id,state,probability);
		this.patient_registered = new ArrayList<Patient>();
	}
}
